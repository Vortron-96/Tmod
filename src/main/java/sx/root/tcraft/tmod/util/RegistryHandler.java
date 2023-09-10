package sx.root.tcraft.tmod.util;
 
import sx.root.tcraft.tmod.items.*;
import sx.root.tcraft.tmod.items.ItemCustomPickaxe;
import net.minecraft.item.Item;
import sx.root.tcraft.tmod.materials.CustomCobalt;
 
import net.minecraftforge.event.RegistryEvent.Register;
 
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
 
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
 
@EventBusSubscriber
 
public class RegistryHandler {
 
    @SubscribeEvent
 
    public static void registerItems(Register<Item> event) {
 
        final Item[] items = {
        					//unlocalized, registry
        		
                new ItemBasic("alloyiron", "alloyiron"),
                new ItemBasic("ingotrefinedcobalt", "ingotrefinedcobalt"),
                new ItemBasic("dustrefinedcobalt", "dustrefinedcobalt"),
                new ItemBasic("ingoturmomium", "ingoturmomium"),
                new ItemBasic("dusturmomium", "dusturmomium"),  
                new ItemBasic("dustrefinedurmomium", "dustrefinedurmomium"),
                new ItemBasic("ingotrefinedurmomium", "ingotrefinedurmomium"),
                new ItemBasic("dustpureurmomium", "dustpureurmomium"),
                new ItemBasic("ingotpureurmomium", "ingotpureurmomium"),
                new ItemBasic("trueurmomium", "trueurmomium"),
                new ItemCustomPickaxe(CustomCobalt.Cobalt, "pickcobalt", "pickcobalt"),
                new ItemCustomAxe(CustomCobalt.AxeCobalt, 10.5F, -3F, "axecobalt", "axecobalt"),
                new ItemCustomHoe(CustomCobalt.Cobalt, "hoecobalt", "hoecobalt"),
                new ItemCustomSword(CustomCobalt.SwordCobalt, "swordcobalt", "swordcobalt"),
                new ItemCustomSpade(CustomCobalt.SpadeCobalt, "spadecobalt", "spadecobalt")
                

 
        };
 
        event.getRegistry().registerAll(items);
 
    }
 
}