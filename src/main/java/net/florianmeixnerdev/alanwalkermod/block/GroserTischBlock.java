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

public class GroserTischBlock extends Block {
	public static final EnumProperty<Direction> FACING = DirectionalBlock.FACING;

	public GroserTischBlock(BlockBehaviour.Properties properties) {
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
			default -> Shapes.or(box(29.6022, 0, 0.1989, 30, 2, 15.9989), box(29.6022, 0.7, 5.2989, 30, 16.7, 7.2989), box(28.8011, 0.8011, 0.1989, 30.8011, 1.1989, 15.9989), box(28.8011, 0.8011, 0.1989, 30.8011, 1.1989, 15.9989),
					box(29.6022, 0, 0.1989, 30, 2, 15.9989), box(26.92342, 0.53284, 0.1989, 27.32122, 2.53284, 15.9989), box(29.6022, 0, 0.1989, 30, 2, 15.9989), box(29.6022, 0, 0.1989, 30, 2, 15.9989),
					box(28.8011, 0.8011, 0.1989, 30.8011, 1.1989, 15.9989), box(-14.3978, 0.7, 5.2989, -14, 16.7, 7.2989), box(-14.3978, 0, 0.1989, -14, 2, 15.9989), box(-15.1989, 0.8011, 0.1989, -13.1989, 1.1989, 15.9989),
					box(-15.1989, 0.8011, 0.1989, -13.1989, 1.1989, 15.9989), box(-14.3978, 0, 0.1989, -14, 2, 15.9989), box(-14.3978, 0, 0.1989, -14, 2, 15.9989), box(-14.3978, 0, 0.1989, -14, 2, 15.9989), box(-14.3978, 0, 0.1989, -14, 2, 15.9989),
					box(-15.1989, 0.8011, 0.1989, -13.1989, 1.1989, 15.9989), box(-16, 14.9, 1.9, 32, 16.6, 18.9));
			case NORTH -> Shapes.or(box(-14, 0, 0.0011, -13.6022, 2, 15.8011), box(-14, 0.7, 8.7011, -13.6022, 16.7, 10.7011), box(-14.8011, 0.8011, 0.0011, -12.8011, 1.1989, 15.8011), box(-14.8011, 0.8011, 0.0011, -12.8011, 1.1989, 15.8011),
					box(-14, 0, 0.0011, -13.6022, 2, 15.8011), box(-11.32122, 0.53284, 0.0011, -10.92342, 2.53284, 15.8011), box(-14, 0, 0.0011, -13.6022, 2, 15.8011), box(-14, 0, 0.0011, -13.6022, 2, 15.8011),
					box(-14.8011, 0.8011, 0.0011, -12.8011, 1.1989, 15.8011), box(30, 0.7, 8.7011, 30.3978, 16.7, 10.7011), box(30, 0, 0.0011, 30.3978, 2, 15.8011), box(29.1989, 0.8011, 0.0011, 31.1989, 1.1989, 15.8011),
					box(29.1989, 0.8011, 0.0011, 31.1989, 1.1989, 15.8011), box(30, 0, 0.0011, 30.3978, 2, 15.8011), box(30, 0, 0.0011, 30.3978, 2, 15.8011), box(30, 0, 0.0011, 30.3978, 2, 15.8011), box(30, 0, 0.0011, 30.3978, 2, 15.8011),
					box(29.1989, 0.8011, 0.0011, 31.1989, 1.1989, 15.8011), box(-16, 14.9, -2.9, 32, 16.6, 14.1));
			case EAST -> Shapes.or(box(0.1989, 0, -14, 15.9989, 2, -13.6022), box(5.2989, 0.7, -14, 7.2989, 16.7, -13.6022), box(0.1989, 0.8011, -14.8011, 15.9989, 1.1989, -12.8011), box(0.1989, 0.8011, -14.8011, 15.9989, 1.1989, -12.8011),
					box(0.1989, 0, -14, 15.9989, 2, -13.6022), box(0.1989, 0.53284, -11.32122, 15.9989, 2.53284, -10.92342), box(0.1989, 0, -14, 15.9989, 2, -13.6022), box(0.1989, 0, -14, 15.9989, 2, -13.6022),
					box(0.1989, 0.8011, -14.8011, 15.9989, 1.1989, -12.8011), box(5.2989, 0.7, 30, 7.2989, 16.7, 30.3978), box(0.1989, 0, 30, 15.9989, 2, 30.3978), box(0.1989, 0.8011, 29.1989, 15.9989, 1.1989, 31.1989),
					box(0.1989, 0.8011, 29.1989, 15.9989, 1.1989, 31.1989), box(0.1989, 0, 30, 15.9989, 2, 30.3978), box(0.1989, 0, 30, 15.9989, 2, 30.3978), box(0.1989, 0, 30, 15.9989, 2, 30.3978), box(0.1989, 0, 30, 15.9989, 2, 30.3978),
					box(0.1989, 0.8011, 29.1989, 15.9989, 1.1989, 31.1989), box(1.9, 14.9, -16, 18.9, 16.6, 32));
			case WEST -> Shapes.or(box(0.0011, 0, 29.6022, 15.8011, 2, 30), box(8.7011, 0.7, 29.6022, 10.7011, 16.7, 30), box(0.0011, 0.8011, 28.8011, 15.8011, 1.1989, 30.8011), box(0.0011, 0.8011, 28.8011, 15.8011, 1.1989, 30.8011),
					box(0.0011, 0, 29.6022, 15.8011, 2, 30), box(0.0011, 0.53284, 26.92342, 15.8011, 2.53284, 27.32122), box(0.0011, 0, 29.6022, 15.8011, 2, 30), box(0.0011, 0, 29.6022, 15.8011, 2, 30),
					box(0.0011, 0.8011, 28.8011, 15.8011, 1.1989, 30.8011), box(8.7011, 0.7, -14.3978, 10.7011, 16.7, -14), box(0.0011, 0, -14.3978, 15.8011, 2, -14), box(0.0011, 0.8011, -15.1989, 15.8011, 1.1989, -13.1989),
					box(0.0011, 0.8011, -15.1989, 15.8011, 1.1989, -13.1989), box(0.0011, 0, -14.3978, 15.8011, 2, -14), box(0.0011, 0, -14.3978, 15.8011, 2, -14), box(0.0011, 0, -14.3978, 15.8011, 2, -14), box(0.0011, 0, -14.3978, 15.8011, 2, -14),
					box(0.0011, 0.8011, -15.1989, 15.8011, 1.1989, -13.1989), box(-2.9, 14.9, -16, 14.1, 16.6, 32));
			case UP -> Shapes.or(box(-14, 0.1989, 0, -13.6022, 15.9989, 2), box(-14, 5.2989, 0.7, -13.6022, 7.2989, 16.7), box(-14.8011, 0.1989, 0.8011, -12.8011, 15.9989, 1.1989), box(-14.8011, 0.1989, 0.8011, -12.8011, 15.9989, 1.1989),
					box(-14, 0.1989, 0, -13.6022, 15.9989, 2), box(-11.32122, 0.1989, 0.53284, -10.92342, 15.9989, 2.53284), box(-14, 0.1989, 0, -13.6022, 15.9989, 2), box(-14, 0.1989, 0, -13.6022, 15.9989, 2),
					box(-14.8011, 0.1989, 0.8011, -12.8011, 15.9989, 1.1989), box(30, 5.2989, 0.7, 30.3978, 7.2989, 16.7), box(30, 0.1989, 0, 30.3978, 15.9989, 2), box(29.1989, 0.1989, 0.8011, 31.1989, 15.9989, 1.1989),
					box(29.1989, 0.1989, 0.8011, 31.1989, 15.9989, 1.1989), box(30, 0.1989, 0, 30.3978, 15.9989, 2), box(30, 0.1989, 0, 30.3978, 15.9989, 2), box(30, 0.1989, 0, 30.3978, 15.9989, 2), box(30, 0.1989, 0, 30.3978, 15.9989, 2),
					box(29.1989, 0.1989, 0.8011, 31.1989, 15.9989, 1.1989), box(-16, 1.9, 14.9, 32, 18.9, 16.6));
			case DOWN -> Shapes.or(box(-14, 0.0011, 14, -13.6022, 15.8011, 16), box(-14, 8.7011, -0.7, -13.6022, 10.7011, 15.3), box(-14.8011, 0.0011, 14.8011, -12.8011, 15.8011, 15.1989), box(-14.8011, 0.0011, 14.8011, -12.8011, 15.8011, 15.1989),
					box(-14, 0.0011, 14, -13.6022, 15.8011, 16), box(-11.32122, 0.0011, 13.46716, -10.92342, 15.8011, 15.46716), box(-14, 0.0011, 14, -13.6022, 15.8011, 16), box(-14, 0.0011, 14, -13.6022, 15.8011, 16),
					box(-14.8011, 0.0011, 14.8011, -12.8011, 15.8011, 15.1989), box(30, 8.7011, -0.7, 30.3978, 10.7011, 15.3), box(30, 0.0011, 14, 30.3978, 15.8011, 16), box(29.1989, 0.0011, 14.8011, 31.1989, 15.8011, 15.1989),
					box(29.1989, 0.0011, 14.8011, 31.1989, 15.8011, 15.1989), box(30, 0.0011, 14, 30.3978, 15.8011, 16), box(30, 0.0011, 14, 30.3978, 15.8011, 16), box(30, 0.0011, 14, 30.3978, 15.8011, 16), box(30, 0.0011, 14, 30.3978, 15.8011, 16),
					box(29.1989, 0.0011, 14.8011, 31.1989, 15.8011, 15.1989), box(-16, -2.9, -0.6, 32, 14.1, 1.1));
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