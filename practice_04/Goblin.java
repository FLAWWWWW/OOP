package practice_04;

public class Goblin extends OnSceneObject implements IDamageable, IDamage {
    private float hp;
    private float damage;

    public Goblin(int pos_x, int pos_y, float hp, float damage){
        super(pos_x, pos_y);
        this.hp = hp;
        this.damage = damage;
    }

    public void Damage(IDamageable target){
        target.getDamage(this.damage);
    }

    public void getDamage(float damage){
        System.out.println("Goblin gets damage!");
        this.hp -= damage;
        if(hp <= 0){
            System.out.println("Goblin dies!");
            super.destroy();
        }
    }
}
