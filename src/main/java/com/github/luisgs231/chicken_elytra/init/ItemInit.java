package com.github.luisgs231.chicken_elytra.init;

import com.github.luisgs231.chicken_elytra.ChickenElytra;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ChickenElytra.MODID, bus = Bus.MOD)
@ObjectHolder(ChickenElytra.MODID)
public class ItemInit {
/*
	public static final Item test_item = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("test_item"));
	}
	*/
}
