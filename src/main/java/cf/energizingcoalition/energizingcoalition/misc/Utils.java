package cf.energizingcoalition.energizingcoalition.misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class Utils
{
    public static final String NAME = "@NAME@";
    public static final String MOD_ID = "@MOD_ID@";
    public static final String VERSION = "@VERSION@";

    public static CreativeTabs tabCustom = new CreativeTabs("tab"+NAME)
    {
        public ItemStack getIconItemStack()
        {
            return new ItemStack(Item.eyeOfEnder, 1, 0);
        }
    };
}
