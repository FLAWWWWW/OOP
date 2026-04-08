package practice_04;

public class Knight extends OnSceneObject implements IDamageable, IInteractor, IDamage {
    private float hp;
    private float damage;

    public Knight(int pos_x, int pos_y, float hp, float damage){
        super(pos_x, pos_y);
        this.hp = hp;
        this.damage = damage;
    }

    public void Damage(IDamageable target){
        target.getDamage(this.damage);
    }

    public void Push(IPushable target, int x, int y){
        target.get_push_by_diraction(x, y);
    }

    public void Interact(IInteractable target){
        target.interact(this);
    }

    public void getDamage(float damage){
        System.out.println("Knight gets damage!");
        this.hp -= damage;
        if(hp <= 0){
            System.out.println("Game Over!");
            super.destroy();
            // Game Over logic
        }
    }
}
