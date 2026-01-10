package net.florianmeixnerdev.alanwalkermusic.client.gui;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.florianmeixnerdev.alanwalkermusic.world.inventory.LinkInfoMenu;
import net.florianmeixnerdev.alanwalkermusic.network.LinkInfoButtonMessage;
import net.florianmeixnerdev.alanwalkermusic.init.AlanWalkerMusicModScreens;

public class LinkInfoScreen extends AbstractContainerScreen<LinkInfoMenu> implements AlanWalkerMusicModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_modrinth;
	private Button button_github;
	private Button button_website;
	private Button button_close;

	public LinkInfoScreen(LinkInfoMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("alan_walker_music:textures/screens/link_info.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("alan_walker_music:textures/screens/awlogo128.png"), this.leftPos + 24, this.topPos + 7, 0, 0, 128, 13, 128, 13);
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.alan_walker_music.link_info.label_links"), 78, 34, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_modrinth = Button.builder(Component.translatable("gui.alan_walker_music.link_info.button_modrinth"), e -> {
			int x = LinkInfoScreen.this.x;
			int y = LinkInfoScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new LinkInfoButtonMessage(0, x, y, z));
				LinkInfoButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 61, 67, 20).build();
		this.addRenderableWidget(button_modrinth);
		button_github = Button.builder(Component.translatable("gui.alan_walker_music.link_info.button_github"), e -> {
			int x = LinkInfoScreen.this.x;
			int y = LinkInfoScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new LinkInfoButtonMessage(1, x, y, z));
				LinkInfoButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 96, this.topPos + 61, 56, 20).build();
		this.addRenderableWidget(button_github);
		button_website = Button.builder(Component.translatable("gui.alan_walker_music.link_info.button_website"), e -> {
			int x = LinkInfoScreen.this.x;
			int y = LinkInfoScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new LinkInfoButtonMessage(2, x, y, z));
				LinkInfoButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 97, 61, 20).build();
		this.addRenderableWidget(button_website);
		button_close = Button.builder(Component.translatable("gui.alan_walker_music.link_info.button_close"), e -> {
			int x = LinkInfoScreen.this.x;
			int y = LinkInfoScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new LinkInfoButtonMessage(3, x, y, z));
				LinkInfoButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 62, this.topPos + 142, 51, 20).build();
		this.addRenderableWidget(button_close);
	}
}