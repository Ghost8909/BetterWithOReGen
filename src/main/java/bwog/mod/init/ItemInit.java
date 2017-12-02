package bwog.mod.init;

import bwog.mod.objects.items.ItemBase;
import net.minecraft.item.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList();
    public static final Item DUST_POTASH = new ItemBase("dust_potash");
    public static final Item DUST_SALT = new ItemBase("dust_salt");
    public static final Item DUST_SALTPETER = new ItemBase("dust_saltpeter");
    public static final Item DUST_SULFUR = new ItemBase("dust_sulfur");
    public static final Item DUST_CHARCOAL = new ItemBase("dust_charcoal");
}

