package net.kaio.bituksmod;

import com.mojang.logging.LogUtils;
import net.kaio.bituksmod.block.ModBlocks;
import net.kaio.bituksmod.item.ModCreativeModeTab;
import net.kaio.bituksmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BituksMod.MOD_ID)
public class BituksMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "bituksmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public BituksMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTab.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == ModCreativeModeTab.BITUKS_TAB.get()) {
            event.accept(ModItems.TURMALINA);
            event.accept(ModItems.TURMALINA_SEEDS);
            event.accept(ModItems.RAW_TURMALINA);
            event.accept(ModItems.TURMALINA_CRISTAL);
            event.accept(ModItems.TURMALINA_PEARL);
            event.accept(ModItems.TURMALINA_FRUIT);
            event.accept(ModItems.TURMALINA_DAGGER);
            event.accept(ModItems.TURMALINA_SWORD);


            event.accept(ModBlocks.TURMALINA_ORE);
            event.accept(ModBlocks.DEEPSLATE_TURMALINA_ORE);
            event.accept(ModBlocks.TURMALINA_CROP);
            event.accept(ModBlocks.TURMALINA_BLOCK);
            event.accept(ModBlocks.RED_ACACIA_WOOD);
            event.accept(ModBlocks.RED_ACACIA_LOG);
            event.accept(ModBlocks.STRIPPED_RED_ACACIA_WOOD);
            event.accept(ModBlocks.STRIPPED_RED_ACACIA_LOG);
            event.accept(ModBlocks.RED_ACACIA_SAPLING);
            event.accept(ModBlocks.RED_ACACIA_PLANKS);
            event.accept(ModBlocks.RED_ACACIA_LEAVES);
        }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.TURMALINA);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.TURMALINA_ORE);
            event.accept(ModBlocks.DEEPSLATE_TURMALINA_ORE);
            event.accept(ModBlocks.TURMALINA_CROP);
            event.accept(ModBlocks.TURMALINA_BLOCK);
            event.accept(ModBlocks.RED_ACACIA_WOOD);
            event.accept(ModBlocks.RED_ACACIA_LOG);
            event.accept(ModBlocks.STRIPPED_RED_ACACIA_WOOD);
            event.accept(ModBlocks.STRIPPED_RED_ACACIA_LOG);
            event.accept(ModBlocks.RED_ACACIA_SAPLING);
            event.accept(ModBlocks.RED_ACACIA_PLANKS);
            event.accept(ModBlocks.RED_ACACIA_LEAVES);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
