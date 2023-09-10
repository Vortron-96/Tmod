package sx.root.tcraft.tmod.util;
 
import sx.root.tcraft.tmod.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 
import net.minecraft.item.Item;
 
import net.minecraftforge.client.event.ModelRegistryEvent;
 
import net.minecraftforge.client.model.ModelLoader;
 
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
 
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
 
import net.minecraftforge.fml.relauncher.Side;
 
@EventBusSubscriber(Side.CLIENT)
 
public class ModelRegistryHandler {
 
    @SubscribeEvent
 
    public static void registerModels(ModelRegistryEvent event) {
 
        registerModel(ModItems.alloyiron);
        registerModel(ModItems.pickcobalt);
        registerModel(ModItems.axecobalt);
        registerModel(ModItems.hoecobalt);
        registerModel(ModItems.swordcobalt);
        registerModel(ModItems.spadecobalt);
        registerModel(ModItems.ingotrefinedcobalt);
        registerModel(ModItems.dustrefinedcobalt);
       // registerModel(ModItems.dustcobalt);



 
    }
 
    private static void registerModel(Item item) {
 
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
 
    }
    
 
}