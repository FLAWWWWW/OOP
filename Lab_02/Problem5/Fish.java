package Lab_02.Problem5;

public class Fish extends Animal {
    private String waterType; // "Freshwater" or "Saltwater"
    
    public Fish(String name, int age) {
        super(name, age);
        this.waterType = "Freshwater";
    }
    
    public Fish(String name, int age, String waterType) {
        super(name, age);
        this.waterType = waterType;
    }
    
    @Override
    public String getSound() {
        return "Blub blub!";
    }
    
    public String getWaterType() {
        return waterType;
    }
}