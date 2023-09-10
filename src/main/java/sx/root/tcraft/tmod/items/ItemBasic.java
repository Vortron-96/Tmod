package sx.root.tcraft.tmod.items;
 
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import sx.root.tcraft.tmod.tmod;
import sx.root.tcraft.tmod.init.ModItems;
import sx.root.tcraft.tmod.util.ModelRegistryHandler;
import sx.root.tcraft.tmod.util.ModelRegistryHandler.*;
import sx.root.tcraft.tmod.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 

 

 
import net.minecraftforge.client.model.ModelLoader;
 
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
 
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
 
import net.minecraftforge.fml.relauncher.Side;
 
 
public class ItemBasic extends Item {
 
    public ItemBasic(String unlocalizedName, String registryName) {
        setUnlocalizedName(tmod.MODID + "." + unlocalizedName);
 
        setRegistryName(registryName);
 
        setCreativeTab(tmod.tmodtab);
    }
  //ModelRegistryHandler.registerModels(registerModel(ModItems.alloyiron));
    //public static void registerModels(ModelRegistryEvent event)
}