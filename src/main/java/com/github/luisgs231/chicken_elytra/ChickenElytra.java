package com.github.luisgs231.chicken_elytra;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.AnvilRepairEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod("chicken_elytra")
public class ChickenElytra {
	public static final String MODID = "chicken_elytra";
	public static ChickenElytra instance;
	private static final Logger LOGGER = LogManager.getLogger();
	
	public ChickenElytra() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }
	
	@SubscribeEvent
	public void onAnvilUpdate(AnvilUpdateEvent event) {
		resetRepairValue(event.getLeft());
		resetRepairValue(event.getRight());
	}
	
	@SubscribeEvent
	public void onAnvilUpdate(AnvilRepairEvent event) {
		resetRepairValue(event.getItemResult());
		event.setBreakChance(0);
	}
	
	private void resetRepairValue(ItemStack stack) {
		if (!stack.isEmpty() && stack.hasTag()) {
			stack.getTag().remove("RepairCost");
		}
	}
	
	private void setup(final FMLCommonSetupEvent event)
    {

    }
	
	private void doClientStuff(final FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }

}