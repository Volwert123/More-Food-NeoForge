package net.volwert123.morefood.block.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.volwert123.morefood.item.MoreFoodItems;
import org.jetbrains.annotations.NotNull;

public class RiceCropBlock extends CropBlock {
    public static final int MAX_AGE = 7;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 7);

    public RiceCropBlock(Properties properties) {
        super(properties);
    }

    protected @NotNull ItemLike getBaseSeedId() {
        return MoreFoodItems.RICE.get();
    }

    public @NotNull IntegerProperty getAgeProperty() {
        return AGE;
    }

    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
}