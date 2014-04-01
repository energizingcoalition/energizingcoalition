package cf.energizingcoalition.energizingcoalition.misc;

import cf.energizingcoalition.energizingcoalition.BlockHelper;
import cf.energizingcoalition.energizingcoalition.EnergizingCoalition;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack itemStack) {
        Item item = itemStack.getItem();

        if(item==EnergizingCoalition.instance.getBlockHelper().ingotLignite)
        {
            return 1200;
        }
        else
        {
            return 0;
        }
    }
}
