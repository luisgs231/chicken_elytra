package com.github.luisgs231.chicken_elytra.init;

import com.github.luisgs231.chicken_elytra.ChickenElytra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ChickenElytra.MODID)
@Mod.EventBusSubscriber(modid = ChickenElytra.MODID, bus = Bus.MOD)
public class BlockInit {
	/*
	public static final Block test_block = null;

	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(0.7f, 14.0f)).setRegistryName(ChickenElytra.MODID, "test_block"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(test_block, new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName("test_block"));
	}
	*/
}
