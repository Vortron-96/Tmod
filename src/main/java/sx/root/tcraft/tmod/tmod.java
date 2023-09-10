package sx.root.tcraft.tmod;

import net.minecraftforge.fml.common.Mod;
import sx.root.tcraft.tmod.tabs.TmodTab;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.text.TextComponentString;

@Mod(modid = tmod.MODID, name = tmod.NAME, version = tmod.VERSION)
public class tmod
{
    public static final String MODID = "tmod";
    public static final String NAME = "tmod";
    public static final String VERSION = "0.1";
    public static final CreativeTabs tmodtab = new TmodTab("tmodtab");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        event.getModLog();

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
      System.out.println("T-Mod up and runnin ");
    }
    
    @EventHandler
    public void init2(FMLPostInitializationEvent event)
    {
      System.out.println("T-Mod up and runnin ");
      
    }
    
    static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
	{
		event.player.sendMessage(new TextComponentString("Welcome to the T-Craft Minecraft server! For more, check http://tcraft.root.sx"));
	}
    
    
}
