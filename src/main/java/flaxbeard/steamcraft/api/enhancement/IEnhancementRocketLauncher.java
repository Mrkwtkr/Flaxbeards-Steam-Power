package flaxbeard.steamcraft.api.enhancement;

import flaxbeard.steamcraft.entity.EntityRocket;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public interface IEnhancementRocketLauncher extends IEnhancement {
    public float getAccuracyChange(Item weapon);

    public float getExplosionChange(Item weapon);

    public int getReloadChange(Item weapon);

    public int getFireDelayChange(ItemStack weapon);

    public int getClipSizeChange(Item weapon);

    public EntityRocket changeBullet(EntityRocket bullet);
}
