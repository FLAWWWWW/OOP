package Lab_02.Problem1.PartC;

import java.util.Objects;

public class Skeleton extends Enemy {
    private int numberOfArrows;
    private String boneType;
    
    public Skeleton(double speed, double damage, int numberOfArrows, String boneType) {
        super(speed, damage);
        this.numberOfArrows = numberOfArrows;
        this.boneType = boneType;
    }
    
    @Override
    public void GoToTarget() {
        System.out.println("The skeleton moves at a speed of " + speed);
    }
    
    @Override
    public void GiveDamage() {
        if(canShootArrow())
            System.out.println("Skeleton deals " + damage + " damage with bow");
        else
            System.out.println("Emotional damage to skeleton only");
    }
    
    public boolean canShootArrow() {
        if (numberOfArrows > 0) {
            System.out.println("Shooting arrow!");
            numberOfArrows--;
            return true;
        } else {
            System.out.println("No arrows left!");
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(speed, damage, numberOfArrows, boneType);
    }
}