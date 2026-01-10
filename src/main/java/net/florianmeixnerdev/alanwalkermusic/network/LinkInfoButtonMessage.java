package net.florianmeixnerdev.alanwalkermusic.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.florianmeixnerdev.alanwalkermusic.procedures.ModrinthLinkProcedure;
import net.florianmeixnerdev.alanwalkermusic.procedures.GithubWebsiteProcedure;
import net.florianmeixnerdev.alanwalkermusic.procedures.GithubProcedure;
import net.florianmeixnerdev.alanwalkermusic.procedures.CloseGUIProcedure;
import net.florianmeixnerdev.alanwalkermusic.AlanWalkerMusicMod;

@EventBusSubscriber
public record LinkInfoButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<LinkInfoButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(AlanWalkerMusicMod.MODID, "link_info_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, LinkInfoButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, LinkInfoButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new LinkInfoButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<LinkInfoButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final LinkInfoButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ModrinthLinkProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			GithubProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			GithubWebsiteProcedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			CloseGUIProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		AlanWalkerMusicMod.addNetworkMessage(LinkInfoButtonMessage.TYPE, LinkInfoButtonMessage.STREAM_CODEC, LinkInfoButtonMessage::handleData);
	}
}