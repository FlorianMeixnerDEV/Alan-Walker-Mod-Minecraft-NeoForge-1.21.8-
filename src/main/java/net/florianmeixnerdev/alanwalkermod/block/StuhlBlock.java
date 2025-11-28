package net.florianmeixnerdev.alanwalkermod.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class StuhlBlock extends Block {
	public static final EnumProperty<Direction> FACING = DirectionalBlock.FACING;

	public StuhlBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(14, 0, 14, 16, 11, 16), box(0, 0, 14, 2, 11, 16), box(0, 0, 0, 2, 11, 2), box(14, 0, 0, 16, 11, 2), box(0, 11, 0, 16, 13, 16), box(0, 13, 0, 2, 30, 2), box(14, 13, 0, 16, 30, 2), box(2, 13, 0, 14, 15, 2),
					box(2, 16, 0, 14, 18, 2), box(2, 19, 0, 14, 21, 2), box(2, 22, 0, 14, 24, 2), box(2, 25, 0, 14, 27, 2), box(2, 28, 0, 14, 30, 2));
			case NORTH -> Shapes.or(box(0, 0, 0, 2, 11, 2), box(14, 0, 0, 16, 11, 2), box(14, 0, 14, 16, 11, 16), box(0, 0, 14, 2, 11, 16), box(0, 11, 0, 16, 13, 16), box(14, 13, 14, 16, 30, 16), box(0, 13, 14, 2, 30, 16), box(2, 13, 14, 14, 15, 16),
					box(2, 16, 14, 14, 18, 16), box(2, 19, 14, 14, 21, 16), box(2, 22, 14, 14, 24, 16), box(2, 25, 14, 14, 27, 16), box(2, 28, 14, 14, 30, 16));
			case EAST -> Shapes.or(box(14, 0, 0, 16, 11, 2), box(14, 0, 14, 16, 11, 16), box(0, 0, 14, 2, 11, 16), box(0, 0, 0, 2, 11, 2), box(0, 11, 0, 16, 13, 16), box(0, 13, 14, 2, 30, 16), box(0, 13, 0, 2, 30, 2), box(0, 13, 2, 2, 15, 14),
					box(0, 16, 2, 2, 18, 14), box(0, 19, 2, 2, 21, 14), box(0, 22, 2, 2, 24, 14), box(0, 25, 2, 2, 27, 14), box(0, 28, 2, 2, 30, 14));
			case WEST -> Shapes.or(box(0, 0, 14, 2, 11, 16), box(0, 0, 0, 2, 11, 2), box(14, 0, 0, 16, 11, 2), box(14, 0, 14, 16, 11, 16), box(0, 11, 0, 16, 13, 16), box(14, 13, 0, 16, 30, 2), box(14, 13, 14, 16, 30, 16), box(14, 13, 2, 16, 15, 14),
					box(14, 16, 2, 16, 18, 14), box(14, 19, 2, 16, 21, 14), box(14, 22, 2, 16, 24, 14), box(14, 25, 2, 16, 27, 14), box(14, 28, 2, 16, 30, 14));
			case UP -> Shapes.or(box(0, 14, 0, 2, 16, 11), box(14, 14, 0, 16, 16, 11), box(14, 0, 0, 16, 2, 11), box(0, 0, 0, 2, 2, 11), box(0, 0, 11, 16, 16, 13), box(14, 0, 13, 16, 2, 30), box(0, 0, 13, 2, 2, 30), box(2, 0, 13, 14, 2, 15),
					box(2, 0, 16, 14, 2, 18), box(2, 0, 19, 14, 2, 21), box(2, 0, 22, 14, 2, 24), box(2, 0, 25, 14, 2, 27), box(2, 0, 28, 14, 2, 30));
			case DOWN -> Shapes.or(box(0, 0, 5, 2, 2, 16), box(14, 0, 5, 16, 2, 16), box(14, 14, 5, 16, 16, 16), box(0, 14, 5, 2, 16, 16), box(0, 0, 3, 16, 16, 5), box(14, 14, -14, 16, 16, 3), box(0, 14, -14, 2, 16, 3), box(2, 14, 1, 14, 16, 3),
					box(2, 14, -2, 14, 16, 0), box(2, 14, -5, 14, 16, -3), box(2, 14, -8, 14, 16, -6), box(2, 14, -11, 14, 16, -9), box(2, 14, -14, 14, 16, -12));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}