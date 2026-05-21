package io.github.thebusybiscuit.slimefun4.utils.itemstack;

import io.github.bakedlibs.dough.items.CustomItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkEffectMeta;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

/**
 * This simple {@link ItemStack} implementation allows us to obtain
 * a colored {@code Material.FIREWORK_STAR} {@link ItemStack} quickly.
 *
 * @author TheBusyBiscuit
 *
 */
public class ColoredFireworkStar {

    @ParametersAreNonnullByDefault
    public static ItemStack create(Color color, String name, String... lore) {
        FireworkEffect effect = FireworkEffect.builder().with(Type.BURST).withColor(color).build();

        ItemStack item = CustomItemStack.of(Material.FIREWORK_STAR);
        FireworkEffectMeta meta = (FireworkEffectMeta) item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        meta.setLore(List.of(lore));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setEffect(effect);

        item.setItemMeta(meta);
        return item;
    }

}
