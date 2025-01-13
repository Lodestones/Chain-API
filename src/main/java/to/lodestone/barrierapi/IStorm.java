package to.lodestone.barrierapi;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public interface IStorm {
    int getDamage();
    int getDamageTick();
    float getX();
    float getZ();
    void setTicksToShrink(int time);
    void setRadius(int radius, int time);
    void setTicksToMove(int time);
    void setRadius(int radius);
    void update();
    void setDamage(int damage);
    float getRadius();
    void setDamageTick(int damageTick);
    void setOrigin(int x, int z, int time);
    void setX(int x);
    void setZ(int z);
    void damage(Player player);
    int getTicksToMove();
    int getTicksToShrink();
    boolean isInStorm(Entity entity);
}
