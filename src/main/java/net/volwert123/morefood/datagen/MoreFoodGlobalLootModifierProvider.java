package net.volwert123.morefood.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.item.MoreFoodItems;
import net.volwert123.morefood.loot.AddItemModifier;

public class MoreFoodGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public MoreFoodGlobalLootModifierProvider(PackOutput output) {
        super(output, MoreFood.MOD_ID);
    }

    @Override
    protected void start() {
        addLootModifier("rice_from_grass", Blocks.SHORT_GRASS, MoreFoodItems.RICE.get());
        addLootModifier("rice_from_fern", Blocks.FERN, MoreFoodItems.RICE.get());
    }

    private void addLootModifier(String name, Block block, Item item) {
        LootItemCondition[] conditions = new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build()
        };
        add(name, new AddItemModifier(conditions, item));
    }
}