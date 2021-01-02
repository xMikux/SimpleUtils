package io.github.mooy1.slimegrid.lists;

import io.github.mooy1.infinitylib.PluginUtils;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;

public final class Categories {

    public static final Category MAIN = new Category(PluginUtils.getKey("main"), new CustomItem(Material.EMERALD, "&6SlimeGrid"), 2);
    public static final Category MACHINES = new Category(PluginUtils.getKey("machines"), new CustomItem(Material.SLIME_BLOCK, "&6Grid Machines"), 2);
    public static final Category GENERATORS = new Category(PluginUtils.getKey("generators"), new CustomItem(Material.HONEY_BLOCK, "&6Grid Generators"), 2);
    public static final Category COMPONENTS = new Category(PluginUtils.getKey("components"), new CustomItem(Material.HONEYCOMB, "&6Grid Components"), 2);
    
}
