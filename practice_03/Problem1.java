class Animal {
    protected String name;
    protected float sound_power;
    
    public Animal(String name, float sound_power) {
        this.name = name;
        this.sound_power = sound_power;
    }
    
    public void makeSound() {
        if(sound_power <= 10)
            System.out.println("Animal makes a quiet sound");
        else if(sound_power <= 20)
            System.out.println("Animal makes a normal sound");
        else
            System.out.println("Animal makes a loud sound");
    }
    
    public void eat() {
        System.out.println(name + " is eating...nothing");
    }
    
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", sound_power: " + sound_power);
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int sound_power, String breed) {
        super(name, sound_power);
        this.breed = breed;
    }
    
    public Dog() {
        super("Unknown", 0);
        this.breed = "Unknown";
    }
    
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(name + " barks: Woof! Woof!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
    
    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        
        Animal animal = new Animal("Generic Animal", 5);
        System.out.println("Animal:");
        animal.displayInfo();
        animal.makeSound();
        animal.eat();
        animal.eat("grass");
        
        System.out.println();
        
        Dog dog = new Dog("Max", 26, "Golden Retriever");
        System.out.println("Dog:");
        dog.displayInfo();
        dog.makeSound();
        dog.eat();
        dog.eat("dog food");
        dog.fetch();
    }
}