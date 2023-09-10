package sx.root.tcraft.tmod.tabs;

import sx.root.tcraft.tmod.tmod;
import sx.root.tcraft.tmod.init.ModItems;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
 
public class TmodTab extends CreativeTabs {
 
    public TmodTab(String name) {
        super(tmod.MODID + "." + name);
    }
 
    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.alloyiron);
    }
 
}