/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.florianmeixnerdev.alanwalkermusic.entity.BodyguardEntity;
import net.florianmeixnerdev.alanwalkermusic.entity.BadAlanEntity;
import net.florianmeixnerdev.alanwalkermusic.entity.AlanWalkerEntity;
import net.florianmeixnerdev.alanwalkermusic.AlanWalkerMusicMod;

@EventBusSubscriber
public class AlanWalkerMusicModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, AlanWalkerMusicMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<AlanWalkerEntity>> ALAN_WALKER = register("alan_walker",
			EntityType.Builder.<AlanWalkerEntity>of(AlanWalkerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BodyguardEntity>> BODYGUARD = register("bodyguard",
			EntityType.Builder.<BodyguardEntity>of(BodyguardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BadAlanEntity>> BAD_ALAN = register("bad_alan",
			EntityType.Builder.<BadAlanEntity>of(BadAlanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(AlanWalkerMusicMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		AlanWalkerEntity.init(event);
		BodyguardEntity.init(event);
		BadAlanEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ALAN_WALKER.get(), AlanWalkerEntity.createAttributes().build());
		event.put(BODYGUARD.get(), BodyguardEntity.createAttributes().build());
		event.put(BAD_ALAN.get(), BadAlanEntity.createAttributes().build());
	}
}