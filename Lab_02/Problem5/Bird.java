package Lab_02.Problem5;

public class Bird extends Animal {
    private boolean canFly;
    
    public Bird(String name, int age) {
        super(name, age);
        this.canFly = true;
    }
    
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }
    
    @Override
    public String getSound() {
        return "Chirp! Chirp!";
    }
    
    public boolean canFly() {
        return canFly;
    }
}