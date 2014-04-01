package cf.energizingcoalition.energizingcoalition.blocks;

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
}
