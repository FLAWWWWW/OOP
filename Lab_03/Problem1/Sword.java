package Lab_03.Problem1;

public class Sword extends Weapon implements IUpgradeable{
    float critical_chance;
    float critical_modifier;

    boolean isBroken;

    Sword(float damage, float durability, float distance, boolean isActive, float critical_chance, float critical_modifier, boolean isBroken){
        super(damage, durability, distance, isActive);
        this.critical_chance = critical_chance;
        this.critical_modifier = critical_modifier;
        this.isBroken = isBroken;
    }

    @Override
    float getDamage(){
        return getCriticalDamage(damage);
    }

    float getCriticalDamage(float damage) {
        float roll = (float) Math.random();

        if (roll < critical_chance) {
            return damage * critical_modifier;
        } else {
            return damage;
        }
    }

    @Override
    public void upgrade() {
        damage += damage/2;
    }
}
