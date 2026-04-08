package Lab_02.Problem5;

public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age) {
        super(name, age);
        this.breed = "Mixed";
    }
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    public String getSound() {
        return "Woof! Woof!";
    }
    
    public String getBreed() {
        return breed;
    }
}