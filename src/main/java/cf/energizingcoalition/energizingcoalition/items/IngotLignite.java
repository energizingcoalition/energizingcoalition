package cf.energizingcoalition.energizingcoalition.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IngotLignite extends Item
{

    public IngotLignite(int id)
    {
        super(id);
        this.setTextureName("energizingcoalition:lignite");
        this.setUnlocalizedName("ingotLignite");
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}
