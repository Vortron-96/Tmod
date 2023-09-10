package sx.root.tcraft.tmod.items;
 
import sx.root.tcraft.tmod.tmod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
 
public class ItemCustomHoe extends ItemHoe {
 
    public ItemCustomHoe(Item.ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);
 
        setUnlocalizedName(tmod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(tmod.tmodtab);
    }
 
}