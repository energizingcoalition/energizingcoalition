package cf.energizingcoalition.energizingcoalition;

import cf.energizingcoalition.energizingcoalition.misc.Utils;
import cf.energizingcoalition.energizingcoalition.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

@Mod(modid= Utils.MOD_ID, name=Utils.NAME, version=Utils.VERSION)
public class EnergizingCoalition
{
    @Instance(value = "EnergizingCoalition")
    public static EnergizingCoalition instance;

    private BlockHelper blockHelper;

    @SidedProxy(clientSide="cf.energizingcoalition.energizingcoalition.proxy.ClientProxy", serverSide="cf.energizingcoalition.energizingcoalition.proxy.CommonProxy")
    public static CommonProxy proxy;

    private Configuration config;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        this.config = new Configuration(event.getSuggestedConfigurationFile());
        this.config.load();
        this.blockHelper = new BlockHelper();
    	this.blockHelper.initBlocks();
    }
   
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	proxy.registerRenderers();
    }
   
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	if(this.config.hasChanged())
        {
            this.config.save();
        }
    }

    public Configuration getConfig()
    {
        return this.config;
    }

    public BlockHelper getBlockHelper()
    {
        return this.blockHelper;
    }
}