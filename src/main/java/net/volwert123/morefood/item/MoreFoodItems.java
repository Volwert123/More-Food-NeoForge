package net.volwert123.morefood.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.block.MoreFoodBlocks;
import net.volwert123.morefood.item.custom.*;

public class MoreFoodItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreFood.MOD_ID);

    public static final DeferredItem<Item> IRON_CARROT = ITEMS.register("iron_carrot", () -> new IronFoodItem(new Item.Properties().food(registerFoodValues(3, 1.5f).build())));
    public static final DeferredItem<Item> DIAMOND_CARROT = ITEMS.register("diamond_carrot", () -> new DiamondFoodItem(new Item.Properties().food(registerFoodValues(3, 1.5f).build())));
    public static final DeferredItem<Item> EMERALD_CARROT = ITEMS.register("emerald_carrot", () -> new EmeraldFoodItem(new Item.Properties().food(registerFoodValues(3, 1.5f).build())));
    public static final DeferredItem<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new Item(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> CARROT_PIECES = ITEMS.register("carrot_pieces", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CARROT_SOUP = ITEMS.register("carrot_soup", () -> new SoupItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));
    public static final DeferredItem<Item> CARROT_BREAD = ITEMS.register("carrot_bread", () -> new Item(new Item.Properties().food(registerFoodValues(6, 3f).build())));
    public static final DeferredItem<Item> CARROT_PIE = ITEMS.register("carrot_pie", () -> new Item(new Item.Properties().food(registerFoodValues(10, 5f).build())));

    public static final DeferredItem<Item> IRON_APPLE = ITEMS.register("iron_apple", () -> new IronFoodItem(new Item.Properties().food(registerFoodValues(4, 2f).build())));
    public static final DeferredItem<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple", () -> new DiamondFoodItem(new Item.Properties().food(registerFoodValues(4, 2f).build())));
    public static final DeferredItem<Item> EMERALD_APPLE = ITEMS.register("emerald_apple", () -> new EmeraldFoodItem(new Item.Properties().food(registerFoodValues(4, 2f).build())));
    public static final DeferredItem<Item> COOKED_APPLE = ITEMS.register("cooked_apple", () -> new Item(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> APPLE_PIECES = ITEMS.register("apple_pieces", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> APPLE_SOUP = ITEMS.register("apple_soup", () -> new SoupItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));
    public static final DeferredItem<Item> APPLE_BREAD = ITEMS.register("apple_bread", () -> new Item(new Item.Properties().food(registerFoodValues(6, 3f).build())));
    public static final DeferredItem<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> new Item(new Item.Properties().food(registerFoodValues(10, 5f).build())));

    public static final DeferredItem<Item> IRON_KELP = ITEMS.register("iron_kelp", () -> new IronFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> GOLD_KELP = ITEMS.register("gold_kelp", () -> new GoldenFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> DIAMOND_KELP = ITEMS.register("diamond_kelp", () -> new DiamondFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> EMERALD_KELP = ITEMS.register("emerald_kelp", () -> new EmeraldFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> KELP_PIECES = ITEMS.register("kelp_pieces", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KELP_SOUP = ITEMS.register("kelp_soup", () -> new SoupItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));

    public static final DeferredItem<Item> IRON_POTATO = ITEMS.register("iron_potato", () -> new IronFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> GOLD_POTATO = ITEMS.register("gold_potato", () -> new GoldenFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> DIAMOND_POTATO = ITEMS.register("diamond_potato", () -> new DiamondFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> EMERALD_POTATO = ITEMS.register("emerald_potato", () -> new EmeraldFoodItem(new Item.Properties().food(registerFoodValues(4, 2f).build())));
    public static final DeferredItem<Item> POTATO_PIECES = ITEMS.register("potato_pieces", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POTATO_SOUP = ITEMS.register("potato_soup", () -> new SoupItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));
    public static final DeferredItem<Item> POTATO_BREAD = ITEMS.register("potato_bread", () -> new Item(new Item.Properties().food(registerFoodValues(6, 3f).build())));

    public static final DeferredItem<Item> COOKED_PHANTOM = ITEMS.register("cooked_phantom", () -> new Item(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> PHANTOM_PIECES = ITEMS.register("phantom_pieces", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PHANTOM_SOUP = ITEMS.register("phantom_soup", () -> new SoupItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));

    public static final DeferredItem<Item> PUFFERFISH_PIECES = ITEMS.register("pufferfish_pieces", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PUFFERFISH_SOUP = ITEMS.register("pufferfish_soup", () -> new PufferfishSoupItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));

    public static final DeferredItem<Item> PUMPKING_SOUP = ITEMS.register("pumpking_soup", () -> new SoupItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));
    public static final DeferredItem<Item> PUMPKING_BREAD = ITEMS.register("pumpking_bread", () -> new Item(new Item.Properties().food(registerFoodValues(6, 3f).build())));

    public static final DeferredItem<Item> COOKED_BAMBOO = ITEMS.register("cooked_bamboo", () -> new Item(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> BAMBOO_PIECES = ITEMS.register("bamboo_pieces", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BAMBOO_SOUP = ITEMS.register("bamboo_soup", () -> new SoupItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));

    public static final DeferredItem<Item> IRON_COOKED_RABBIT = ITEMS.register("iron_cooked_rabbit", () -> new IronFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> GOLD_COOKED_RABBIT = ITEMS.register("gold_cooked_rabbit", () -> new GoldenFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> DIAMOND_COOKED_RABBIT = ITEMS.register("diamond_cooked_rabbit", () -> new DiamondFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> EMERALD_COOKED_RABBIT = ITEMS.register("emerald_cooked_rabbit", () -> new EmeraldFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));

    public static final DeferredItem<Item> IRON_MELON_SLICE = ITEMS.register("iron_melon_slice", () -> new IronFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> GOLD_MELON_SLICE = ITEMS.register("gold_melon_slice", () -> new GoldenFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> DIAMOND_MELON_SLICE = ITEMS.register("diamond_melon_slice", () -> new DiamondFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> EMERALD_MELON_SLICE = ITEMS.register("emerald_melon_slice", () -> new EmeraldFoodItem(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));

    public static final DeferredItem<Item> IRON_COOKED_CHICKEN = ITEMS.register("iron_cooked_chicken", () -> new IronFoodItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));
    public static final DeferredItem<Item> GOLD_COOKED_CHICKEN = ITEMS.register("gold_cooked_chicken", () -> new GoldenFoodItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));
    public static final DeferredItem<Item> DIAMOND_COOKED_CHICKEN = ITEMS.register("diamond_cooked_chicken", () -> new DiamondFoodItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));
    public static final DeferredItem<Item> EMERALD_COOKED_CHICKEN = ITEMS.register("emerald_cooked_chicken", () -> new EmeraldFoodItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));

    public static final DeferredItem<Item> IRON_COOKED_MUTTON = ITEMS.register("iron_cooked_mutton", () -> new IronFoodItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));
    public static final DeferredItem<Item> GOLD_COOKED_MUTTON = ITEMS.register("gold_cooked_mutton", () -> new GoldenFoodItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));
    public static final DeferredItem<Item> DIAMOND_COOKED_MUTTON = ITEMS.register("diamond_cooked_mutton", () -> new DiamondFoodItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));
    public static final DeferredItem<Item> EMERALD_COOKED_MUTTON = ITEMS.register("emerald_cooked_mutton", () -> new EmeraldFoodItem(new Item.Properties().food(registerFoodValues(6, 3f).build())));

    public static final DeferredItem<Item> IRON_COOKED_PORKCHOP = ITEMS.register("iron_cooked_porkchop", () -> new IronFoodItem(new Item.Properties().food(registerFoodValues(8, 4f).build())));
    public static final DeferredItem<Item> GOLD_COOKED_PORKCHOP = ITEMS.register("gold_cooked_porkchop", () -> new GoldenFoodItem(new Item.Properties().food(registerFoodValues(8, 4f).build())));
    public static final DeferredItem<Item> DIAMOND_COOKED_PORKCHOP = ITEMS.register("diamond_cooked_porkchop", () -> new DiamondFoodItem(new Item.Properties().food(registerFoodValues(8, 4f).build())));
    public static final DeferredItem<Item> EMERALD_COOKED_PORKCHOP = ITEMS.register("emerald_cooked_porkchop", () -> new EmeraldFoodItem(new Item.Properties().food(registerFoodValues(8, 4f).build())));

    public static final DeferredItem<Item> IRON_COOKED_BEEF = ITEMS.register("iron_cooked_beef", () -> new IronFoodItem(new Item.Properties().food(registerFoodValues(8, 4f).build())));
    public static final DeferredItem<Item> GOLD_COOKED_BEEF = ITEMS.register("gold_cooked_beef", () -> new GoldenFoodItem(new Item.Properties().food(registerFoodValues(8, 4f).build())));
    public static final DeferredItem<Item> DIAMOND_COOKED_BEEF = ITEMS.register("diamond_cooked_beef", () -> new DiamondFoodItem(new Item.Properties().food(registerFoodValues(8, 4f).build())));
    public static final DeferredItem<Item> EMERALD_COOKED_BEEF = ITEMS.register("emerald_cooked_beef", () -> new EmeraldFoodItem(new Item.Properties().food(registerFoodValues(8, 4f).build())));

    public static final DeferredItem<Item> RICE = ITEMS.register("rice", () -> new ItemNameBlockItem(MoreFoodBlocks.RICE_CROP.get(), new Item.Properties()));
    public static final DeferredItem<Item> RICE_CHICKENBOWL = ITEMS.register("rice_chickenbowl", () -> new RiceBowlItem(new Item.Properties().food(registerFoodValues(10, 5f).build())));
    public static final DeferredItem<Item> RICE_SALMONBOWL = ITEMS.register("rice_salmonbowl", () -> new RiceBowlItem(new Item.Properties().food(registerFoodValues(10, 5f).build())));
    public static final DeferredItem<Item> RICE_CODBOWL = ITEMS.register("rice_codbowl", () -> new RiceBowlItem(new Item.Properties().food(registerFoodValues(10, 5f).build())));
    public static final DeferredItem<Item> RICE_VEGETABLEBOWL = ITEMS.register("rice_vegetablebowl", () -> new RiceBowlItem(new Item.Properties().food(registerFoodValues(9, 4.5f).build())));

    public static final DeferredItem<Item> SUSHI_BAMBOO = ITEMS.register("sushi_bamboo", () -> new Item(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> SUSHI_CARROT = ITEMS.register("sushi_carrot", () -> new Item(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> SUSHI_BEETROOT = ITEMS.register("sushi_beetroot", () -> new Item(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));
    public static final DeferredItem<Item> SUSHI_SALMON = ITEMS.register("sushi_salmon", () -> new Item(new Item.Properties().food(registerFoodValues(5, 2.5f).build())));

    private static FoodProperties.Builder registerFoodValues(int nutrition, float saturation) {
        return new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturation);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}