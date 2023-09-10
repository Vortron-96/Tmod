package sx.root.tcraft.tmod.items;
 
import sx.root.tcraft.tmod.tmod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
 
public class ItemCustomPickaxe extends ItemPickaxe {
 
    public ItemCustomPickaxe(Item.ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);
 
        setUnlocalizedName(tmod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(tmod.tmodtab);
    }
 
}