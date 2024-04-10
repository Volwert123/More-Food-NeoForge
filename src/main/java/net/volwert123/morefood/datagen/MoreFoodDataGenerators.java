package net.volwert123.morefood.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.volwert123.morefood.MoreFood;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = MoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreFoodDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new MoreFoodBlockStateProvider(packOutput, fileHelper));
        generator.addProvider(true, new MoreFoodGlobalLootModifierProvider(packOutput));
        generator.addProvider(true, MoreFoodLootTableProvider.create(packOutput));
        generator.addProvider(true, new MoreFoodModelProvider(packOutput, fileHelper));
        generator.addProvider(true, new MoreFoodRecipeProvider(packOutput, lookupProvider));
    }
}