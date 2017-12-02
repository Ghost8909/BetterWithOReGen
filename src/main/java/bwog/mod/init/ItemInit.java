package bwog.mod.init;

import bwog.mod.objects.items.ItemBase;
import net.minecraft.item.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList();
    public static final Item POTASH_DUST = new ItemBase("dust_potash");
    public static final Item SALT_DUST = new ItemBase("dust_salt");
    public static final Item SALTPETER_DUST = new ItemBase("dust_saltpeter");
    public static final Item SULFUR_DUST = new ItemBase("dust_sulfur");
    public static final Item CHARCOAL_DUST = new ItemBase("dust_charcoal");
}

