package io.github.thebusybiscuit.slimefun4.implementation.items.misc;

import javax.annotation.ParametersAreNonnullByDefault;

import org.apache.commons.lang.Validate;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.Smeltery;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

/**
 * The {@link GoldIngot} from Slimefun is a simple resource which is divided into different
 * levels of carat ratings.
 * <p>
 * It can be obtained via gold dust and other gold ingots in a {@link Smeltery}.
 * 
 * @author TheBusyBiscuit
 * 
 * @see Smeltery
 *
 */
public class GoldIngot extends SlimefunItem {

    /**
     * The carat rating.
     */
    private final int caratRating;

    @ParametersAreNonnullByDefault
    public GoldIngot(Category category, int caratRating, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);

        Validate.isTrue(caratRating > 0, "Carat must be above zero.");
        Validate.isTrue(caratRating < 24, "Carat cannot go above 24.");
        this.caratRating = caratRating;
    }

    /**
     * This returns the carat rating of this {@link GoldIngot}.
     * <p>
     * The purity of the {@link GoldIngot} is measured in carat.
     * 
     * <pre>
     * 24k = 100% gold.
     * 18k = 75% gold.
     * 12k = 50% gold.
     * </pre>
     * 
     * and so on...
     * 
     * @return The carat rating of this {@link GoldIngot}
     */
    public int getCaratRating() {
        return caratRating;
    }

}