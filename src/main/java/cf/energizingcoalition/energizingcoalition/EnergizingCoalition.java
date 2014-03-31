package cf.energizingcoalition.energizingcoalition;

import cf.energizingcoalition.energizingcoalition.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="EnergizingCoalition", name="Energizing Coalition", version="@VERSION@")
public class EnergizingCoalition
{
    @Instance(value = "EnergizingCoalition")
    public static EnergizingCoalition instance;
   
    @SidedProxy(clientSide="cf.energizingcoalition.proxy.ClientProxy", serverSide="cf.energizingcoalition.proxy.CommonProxy")
    public static CommonProxy proxy;
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }
   
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	proxy.registerRenderers();
    }
   
    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}