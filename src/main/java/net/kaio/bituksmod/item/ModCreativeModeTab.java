package net.kaio.bituksmod.item;

import net.kaio.bituksmod.BituksMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTab {
      public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BituksMod.MOD_ID);

      public static RegistryObject<CreativeModeTab> BITUKS_TAB = CREATIVE_MODE_TAB.register("bituks_mod", () -> CreativeModeTab.builder().icon(
              () -> new ItemStack(ModItems.TURMALINA.get())).title(Component.translatable("creativemodetab.bituks_tab")).build());

      public static void register(IEventBus eventBus){
          CREATIVE_MODE_TAB.register(eventBus);
      }
}