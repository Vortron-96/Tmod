package sx.root.tcraft.tmod.items;


import sx.root.tcraft.tmod.tmod;
 
import net.minecraft.item.ItemAxe;
 
public class ItemCustomAxe extends ItemAxe {
 
    public ItemCustomAxe(ToolMaterial material, float damage, float speed, String unlocalizedName, String registryName) {
        super(material, damage, speed);


        setUnlocalizedName(tmod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(tmod.tmodtab);
    }
 
}