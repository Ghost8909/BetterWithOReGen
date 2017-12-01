package bwog.mod;

import bwog.mod.proxy.ClientProxy;
import bwog.mod.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class Main
{

    @Instance
    public static Main Instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static ClientProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {}
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {}
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}
}
