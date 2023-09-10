package sx.root.tcraft.tmod.items;
 
import sx.root.tcraft.tmod.tmod;
import sx.root.tcraft.tmod.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
 
public class ItemCustomSword extends ItemSword {
 
    public ItemCustomSword(Item.ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);
 
        setUnlocalizedName(tmod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(tmod.tmodtab);

        
    }
 
}