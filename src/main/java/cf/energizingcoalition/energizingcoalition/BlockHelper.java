package cf.energizingcoalition.energizingcoalition;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cf.energizingcoalition.energizingcoalition.blocks.BlockGas;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockHelper
{
	public static Block blockGas;
	
	public static void initBlocks()
	{
		blockGas = new BlockGas(Material.air)
	    			.setHardness(0.5F).setStepSound(Block.soundClothFootstep)
	    			.setCreativeTab(CreativeTabs.tabBlock);
		GameRegistry.registerBlock(blockGas, "blockGas");
		LanguageRegistry.addName(blockGas, "Gas");
		
	}
}
