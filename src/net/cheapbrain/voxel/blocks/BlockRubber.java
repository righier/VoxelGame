package net.cheapbrain.voxel.blocks;

import net.cheapbrain.voxel.World;

public class BlockRubber extends Block{

	public BlockRubber(){
		super(6, true); //passing id to super constructor
		setUntraversable();
		setElasticity(255);
		setHardness(64);
		setResistance(128);
		setUnslidable();
	}
	
	@Override
	public void render(int x, int y, int z, int data, World world) {
		render(x, y, z, new int[]{6}, neighbours(x, y, z, world));
	}
}
