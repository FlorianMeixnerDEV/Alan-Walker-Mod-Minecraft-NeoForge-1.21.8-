/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermod.init;

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

import net.florianmeixnerdev.alanwalkermod.entity.AlanWalkerZombieEntity;
import net.florianmeixnerdev.alanwalkermod.entity.AlanWalkerEntity;
import net.florianmeixnerdev.alanwalkermod.entity.AlanGuardEntity;
import net.florianmeixnerdev.alanwalkermod.AlanWalkerModMod;

@EventBusSubscriber
public class AlanWalkerModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, AlanWalkerModMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<AlanWalkerEntity>> ALAN_WALKER = register("alan_walker",
			EntityType.Builder.<AlanWalkerEntity>of(AlanWalkerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(15).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlanWalkerZombieEntity>> ALAN_WALKER_ZOMBIE = register("alan_walker_zombie",
			EntityType.Builder.<AlanWalkerZombieEntity>of(AlanWalkerZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlanGuardEntity>> ALAN_GUARD = register("alan_guard",
			EntityType.Builder.<AlanGuardEntity>of(AlanGuardEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(AlanWalkerModMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		AlanWalkerEntity.init(event);
		AlanWalkerZombieEntity.init(event);
		AlanGuardEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ALAN_WALKER.get(), AlanWalkerEntity.createAttributes().build());
		event.put(ALAN_WALKER_ZOMBIE.get(), AlanWalkerZombieEntity.createAttributes().build());
		event.put(ALAN_GUARD.get(), AlanGuardEntity.createAttributes().build());
	}
}