package net.volwert123.morefood.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.item.MoreFoodItems;

public class MoreFoodModelProvider extends ItemModelProvider {
    public MoreFoodModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreFood.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        MoreFoodItems.ITEMS.getEntries().stream().map(DeferredHolder::get).forEach(this::basicItem);
    }
}