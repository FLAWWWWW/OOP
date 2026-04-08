package Lab_02.Problem1.PartC;

public class Problem {
    public static void main(String[] args) {
        Skeleton skeleton = new Skeleton(5.5, 15.0, 3, "Human");
        
        skeleton.GoToTarget();
        
        skeleton.GiveDamage();
        skeleton.GiveDamage();
        skeleton.GiveDamage();
        skeleton.GiveDamage();
        
        System.out.println("skeleton equals itself: " + skeleton.equals(skeleton));
        
        System.out.println(skeleton.hashCode());
    }
}