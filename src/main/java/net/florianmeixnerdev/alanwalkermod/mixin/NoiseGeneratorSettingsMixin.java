package net.florianmeixnerdev.alanwalkermod.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.florianmeixnerdev.alanwalkermod.init.AlanWalkerModModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements AlanWalkerModModBiomes.AlanWalkerModModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> alan_walker_mod_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.alan_walker_mod_dimensionTypeReference != null) {
			retval = AlanWalkerModModBiomes.adaptSurfaceRule(retval, this.alan_walker_mod_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setalan_walker_modDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.alan_walker_mod_dimensionTypeReference = dimensionType;
	}
}