package divinerpg.blocks.arcana;

import divinerpg.blocks.base.*;
import net.minecraft.world.item.context.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.*;

public class BlockAcceleron extends BlockMod {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public BlockAcceleron() {
        super(Block.Properties.of(Material.METAL, MaterialColor.LAPIS)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .friction(1.2F));
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}