package cf.energizingcoalition.energizingcoalition;

import cf.energizingcoalition.energizingcoalition.blocks.OreLignite;
import cf.energizingcoalition.energizingcoalition.items.IngotLignite;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cf.energizingcoalition.energizingcoalition.blocks.BlockGas;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public final class BlockHelper
{
	public final Block blockGas = new BlockGas()
            .setHardness(0.5F)
            .setStepSound(Block.soundClothFootstep)
            .setCreativeTab(CreativeTabs.tabBlock);

    public final Block oreLignite = new OreLignite(EnergizingCoalition.instance.getConfig().getBlock("oreLignite",4001).getInt());
    public final Item ingotLignite = new IngotLignite(EnergizingCoalition.instance.getConfig().getItem("ingotLignite", 31000).getInt());

	public void initBlocks()
	{
        if(this.blockGas.blockID!=0)
        {
		    GameRegistry.registerBlock(this.blockGas, "blockGas");
		    LanguageRegistry.addName(this.blockGas, "Gas");
        }

        if(this.oreLignite.blockID!=0)
        {
            GameRegistry.registerBlock(this.oreLignite, "oreLignite");
            LanguageRegistry.addName(this.oreLignite, "Lignite Ore");
            OreDictionary.registerOre("oreLignite",this.oreLignite);
        }
        if(this.ingotLignite.itemID!=0)
        {
            GameRegistry.registerItem(this.ingotLignite, "ingotLignite");
            LanguageRegistry.addName(this.ingotLignite, "Lignite");
            OreDictionary.registerOre("ingotLignite",this.ingotLignite);
        }
		
	}
}
