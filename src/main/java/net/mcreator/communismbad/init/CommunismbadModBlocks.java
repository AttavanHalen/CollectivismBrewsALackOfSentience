
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communismbad.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.communismbad.block.TestBlock;
import net.mcreator.communismbad.block.Test2Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommunismbadModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block TEST = register(new TestBlock());
	public static final Block TEST_2 = register(new Test2Block());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
