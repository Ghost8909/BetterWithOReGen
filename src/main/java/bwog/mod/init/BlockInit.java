package bwog.mod.init;

import bwog.mod.objects.blocks.BlockBase;
import bwog.mod.objects.blocks.BlockFallingBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList();
    public static final Block BLOCK_POTASH = new BlockFallingBase("block_potash", Material.SAND, SoundType.SAND);
    public static final Block BLOCK_SALT = new BlockFallingBase("block_salt", Material.SAND, SoundType.SAND);
    public static final Block BLOCK_SALTPETER = new BlockFallingBase("block_saltpeter", Material.SAND, SoundType.SAND);
    public static final Block BLOCK_SULFUR = new BlockFallingBase("block_sulfur", Material.SAND, SoundType.SAND);
    public static final Block BLOCK_CHARCOAL = new BlockFallingBase("block_charcoal", Material.SAND, SoundType.SAND);
    public static final Block ORE_POTASH = new BlockBase("ore_potash", Material.ROCK);
    public static final Block ORE_SALT = new BlockBase("ore_salt", Material.ROCK);
    public static final Block ORE_SALTPETER = new BlockBase("ore_saltpeter", Material.ROCK);
    public static final Block ORE_SULFUR = new BlockBase("ore_sulfur", Material.ROCK);
}
