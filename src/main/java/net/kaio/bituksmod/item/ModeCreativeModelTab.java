package net.kaio.bituksmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModeCreativeModelTab {
    public static final CreativeModeTab BITUKS_TAB = new CreativeModeTab("bitukstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TURMALINA.get());
        }

    };
}
