package net.kaio.bituksmod.item;

import net.kaio.bituksmod.BituksMod;
import net.kaio.bituksmod.block.ModBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BituksMod.MOD_ID);

    //mudar e configurar item
    public static final RegistryObject<Item> TURMALINA = ITEMS.register("turmalina", () -> new Item(new Item.Properties().tab(ModeCreativeModelTab.BITUKS_TAB)));
    public static final RegistryObject<Item> RAW_TURMALINA = ITEMS.register("raw_turmalina", () -> new Item(new Item.Properties().tab(ModeCreativeModelTab.BITUKS_TAB)));
    public static final RegistryObject<Item> TURMALINA_CRISTAL = ITEMS.register("turmalina_cristal", () -> new Item(new Item.Properties().tab(ModeCreativeModelTab.BITUKS_TAB)));
    public static final RegistryObject<Item> TURMALINA_PEARL = ITEMS.register("turmalina_pearl", () -> new Item(new Item.Properties().tab(ModeCreativeModelTab.BITUKS_TAB)));
    public static final RegistryObject<Item> TURMALINA_SEEDS = ITEMS.register("turmalina_seeds", () -> new ItemNameBlockItem(ModBlocks.TURMALINA_CROP.get(),
            new Item.Properties().tab(ModeCreativeModelTab.BITUKS_TAB)));

    public static final RegistryObject<Item> TURMALINA_FRUIT = ITEMS.register("turmalina_fruit",
            () -> new Item(new Item.Properties().tab(ModeCreativeModelTab.BITUKS_TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(2f).build())));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
