package net.kaio.bituksmod.item;

import net.kaio.bituksmod.BituksMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BituksMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab BITUKS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        BITUKS_TAB = event.registerCreativeModeTab(new ResourceLocation(BituksMod.MOD_ID, "bituks_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.TURMALINA.get())).title(Component.literal("Bituks Tab")).build());
    }
}