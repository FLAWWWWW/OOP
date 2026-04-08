package Lab_02.Problem1.PartC;

public abstract class Enemy {
    protected double speed;
    protected double damage;

    public Enemy(double speed, double damage){
        this.speed = speed;
        this.damage = damage;
    }

    public void GoToTarget(){}

    public void GiveDamage(){}

    @Override
    public boolean equals(Object o){
        return true;
    }

    @Override
    public int hashCode(){
        return 0;
    }
}
