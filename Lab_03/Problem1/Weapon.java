package Lab_03.Problem1;

public abstract class Weapon {
    float damage;
    float durability;
    float distance;
    boolean isActive;


    Weapon(float damage, float durability, float distance, boolean isActive){
        this.damage = damage;
        this.durability = durability;
        this.distance = distance;
        this.isActive = isActive;
    }

    float getDamage(){
        return damage;
    }

    boolean isInDistance(float distance){
        if(this.distance >= distance) return true;
        return false;
    }
    void reduceDurability()
    {
        durability -=  durability * 10 / 100;
        if(durability <= 0) {
            //удаляем объект
        }
    }
    void changeActiveStatus()
    {
        if(isActive) isActive = false;
        isActive = true;
    }
}
