package cf.energizingcoalition.energizingcoalition.blocks;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGas extends Block
{
	public BlockGas(Material material)
	{
		super(4000, material);
		this.setUnlocalizedName("blockGas");
		this.setTextureName("energizingcoalition:gas");
		this.setLightOpacity(1);
		
		//this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.0F , 0.0F, 0.0F);
	}
	
	@Override
    public int getRenderBlockPass()
	{
		return 1;
	}
	
	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
	{
		entity.attackEntityFrom(DamageSource.drown, 0.5f);
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	@Override
	public boolean isCollidable()
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	{
		return null;
	}
	
	@Override
	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int x, int y, int z, int par5)											
	{

		int id = par1IBlockAccess.getBlockId(x, y, z);

		//return id == 0 || id == blockID ? true : false;
		return id != 0 ? false : true;
	}

}
