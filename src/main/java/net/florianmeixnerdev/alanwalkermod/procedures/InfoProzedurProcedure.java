package net.florianmeixnerdev.alanwalkermod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.ChatFormatting;

public class InfoProzedurProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("---Info---").withColor(0xff3333).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC), false);
		}
		if (world instanceof ServerLevel _level) {
			_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Mod-Version: 1.3"), false);
		}
		if (world instanceof ServerLevel _level) {
			_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Mod Ersteller: FlorianMeixnerDEV"), false);
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"tellraw @a [\"\",{\"text\":\"Website: \"},{\"text\":\"florianmeixnerdev.github.io\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://florianmeixnerdev.github.io/\"}},{\"text\":\" \"}]");
	}
}