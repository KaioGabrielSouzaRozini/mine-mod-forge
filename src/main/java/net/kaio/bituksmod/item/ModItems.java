package net.kaio.bituksmod.item;

import net.kaio.bituksmod.BituksMod;
import net.kaio.bituksmod.block.ModBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BituksMod.MOD_ID);

    //mudar e configurar item
    public static final RegistryObject<Item> TURMALINA = ITEMS.register("turmalina", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TURMALINA = ITEMS.register("raw_turmalina", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TURMALINA_CRISTAL = ITEMS.register("turmalina_cristal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TURMALINA_PEARL = ITEMS.register("turmalina_pearl", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TURMALINA_SEEDS = ITEMS.register("turmalina_seeds", () -> new ItemNameBlockItem(ModBlocks.TURMALINA_CROP.get(),
            new Item.Properties()));

    public static final RegistryObject<Item> TURMALINA_FRUIT = ITEMS.register("turmalina_fruit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(2f).build())));

    public static final RegistryObject<Item> TURMALINA_SWORD = ITEMS.register("turmalina_sword", () -> new SwordItem(Tiers.NETHERITE, 3, -2.4f,
            new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TURMALINA_DAGGER = ITEMS.register("turmalina_dagger", () -> new SwordItem(Tiers.NETHERITE, 5, 8f,
            new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TURMALINA_HELMET = ITEMS.register("turmalina_helmet", () -> new ArmorItem(ModArmorMaterials.TURMALINA, ArmorItem.Type.HELMET,
            new Item.Properties()));
    public static final RegistryObject<Item> TURMALINA_CHESTPLATE = ITEMS.register("turmalina_chestplate", () -> new ArmorItem(ModArmorMaterials.TURMALINA, ArmorItem.Type.CHESTPLATE,
            new Item.Properties()));
    public static final RegistryObject<Item> TURMALINA_LEGGINGS = ITEMS.register("turmalina_legging", () -> new ArmorItem(ModArmorMaterials.TURMALINA, ArmorItem.Type.LEGGINGS,
            new Item.Properties()));
    public static final RegistryObject<Item> TURMALINA_BOOTS = ITEMS.register("turmalina_boots", () -> new ArmorItem(ModArmorMaterials.TURMALINA, ArmorItem.Type.BOOTS,
            new Item.Properties()));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
