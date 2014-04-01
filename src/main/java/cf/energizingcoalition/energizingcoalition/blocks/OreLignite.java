package cf.energizingcoalition.energizingcoalition.blocks;

import cf.energizingcoalition.energizingcoalition.EnergizingCoalition;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreLignite extends Block {

    public OreLignite(int id)
    {
        super(id, Material.rock);
        this.setUnlocalizedName("oreLignite");
        this.setTextureName("energizingcoalition:lignite_ore");
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setHardness(0.8F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setLightOpacity(0);
    }

    @Override
    public int quantityDropped(java.util.Random random)
    {
        if(random.nextBoolean())
        {
            return 2;
        }

        return 1;
    }

    @Override
    public int idDropped(int par1, java.util.Random par2Random, int par3)
    {
        return EnergizingCoalition.instance.getBlockHelper().ingotLignite.itemID;
    }
}
