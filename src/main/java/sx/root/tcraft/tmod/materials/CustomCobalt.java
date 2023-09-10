package sx.root.tcraft.tmod.materials;
 
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import sx.root.tcraft.tmod.tmod;
import sx.root.tcraft.tmod.init.ModItems;
import sx.root.tcraft.tmod.util.RegistryHandler;

 
public class CustomCobalt {
	
    public static final Item.ToolMaterial Cobalt = EnumHelper.addToolMaterial(tmod.MODID + ":" + "Cobalt", 4, 1200, 5.5F, 4.5F, 9).setRepairItem(new ItemStack(ModItems.alloyiron));
    public static final Item.ToolMaterial AxeCobalt = EnumHelper.addToolMaterial(tmod.MODID + ":" + "AxeCobalt", 4, 1200, 5.5F, 8.0F, 9).setRepairItem(new ItemStack(ModItems.alloyiron));
    public static final Item.ToolMaterial SpadeCobalt = EnumHelper.addToolMaterial(tmod.MODID + ":" + "SpadeCobalt", 4, 1200, 5.5F, -1F, 9).setRepairItem(new ItemStack(ModItems.alloyiron));
    public static final Item.ToolMaterial SwordCobalt = EnumHelper.addToolMaterial(tmod.MODID + ":" + "SwordCobalt", 4, 1200, 5.3F, 4.5F, 9).setRepairItem(new ItemStack(ModItems.ingoturmomium));
    
}