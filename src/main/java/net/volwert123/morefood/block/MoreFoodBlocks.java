package net.volwert123.morefood.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.block.custom.RiceCropBlock;

public class MoreFoodBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreFood.MOD_ID);

    public static final DeferredBlock<RiceCropBlock> RICE_CROP = BLOCKS.register("rice_crop", () -> new RiceCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CARROTS).noCollission().noOcclusion()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}