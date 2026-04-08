package Lab_03.Problem1;

public class Bow extends Weapon implements IUpgradeable{
    int arrowCount;

    Bow(float damage, float durability, float distance, boolean isActive, int arrowCount){
        super(damage, durability, distance, isActive);
        this.arrowCount = arrowCount;
    }

    @Override
    float getDamage(){
        arrowCount -= 1;
        return damage;
    }

    @Override
    public void upgrade() {
        distance += distance*0.1;
    }
}
