package net.kaio.bituksmod.block;

import net.kaio.bituksmod.BituksMod;
import net.kaio.bituksmod.block.custom.ModFlammableRotatedPillarBlock;
import net.kaio.bituksmod.block.custom.TurmalinaCropBlock;
import net.kaio.bituksmod.item.ModItems;
import net.kaio.bituksmod.world.feature.tree.RedAcaciaTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BituksMod.MOD_ID);

    //mudar e configurar bloco
    public static final RegistryObject<Block> TURMALINA_ORE = registerBlock("turmalina_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> DEEPSLATE_TURMALINA_ORE = registerBlock("deepslate_turmalina_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> TURMALINA_BLOCK = registerBlock("turmalina_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TURMALINA_CROP = BLOCKS.register("turmalina_crop",
            () -> new TurmalinaCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> RED_ACACIA_LOG = registerBlock("red_acacia_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_ACACIA_WOOD = registerBlock("red_acacia_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STRIPPED_RED_ACACIA_LOG = registerBlock("stripped_red_acacia_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STRIPPED_RED_ACACIA_WOOD = registerBlock("stripped_red_acacia_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_ACACIA_PLANKS = registerBlock("red_acacia_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops()){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });

    public static final RegistryObject<Block> RED_ACACIA_LEAVES = registerBlock("red_acacia_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops()){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            });

    public static final RegistryObject<Block> RED_ACACIA_SAPLING = registerBlock("red_acacia_sapling",
            () -> new SaplingBlock(new RedAcaciaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
