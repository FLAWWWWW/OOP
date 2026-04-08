package Lab_02.Problem5;

import java.util.Objects;

public abstract class Person {
    protected String name;
    protected int age;
    protected Animal pet;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
    }
    
    public void assignPet(Animal pet) {
        if (canHavePet(pet)) {
            this.pet = pet;
            System.out.println(name + " now owns " + pet.getName());
        } else {
            System.out.println(name + " cannot have this type of pet: " + pet.getClass().getSimpleName());
        }
    }
    
    public void removePet() {
        if (hasPet()) {
            System.out.println(name + " removed pet: " + pet.getName());
            this.pet = null;
        } else {
            System.out.println(name + " doesn't have a pet to remove");
        }
    }
    
    public boolean hasPet() {
        return pet != null;
    }
    
    public Animal getPet() {
        return pet;
    }
    
    public abstract String getOccupation();
    
    protected boolean canHavePet(Animal pet) {
        return true;
    }
    
    public void leavePetWith(Person caretaker) {
        if (!hasPet()) {
            System.out.println(name + " doesn't have a pet to leave");
            return;
        }
        
        if (caretaker.hasPet()) {
            System.out.println(caretaker.name + " already has a pet");
            return;
        }
        
        if (!caretaker.canHavePet(this.pet)) {
            System.out.println(caretaker.name + " cannot take care of " + pet.getName() + 
                             " (" + pet.getClass().getSimpleName() + ")");
            return;
        }
        
        Animal petToTransfer = this.pet;
        this.pet = null;
        caretaker.assignPet(petToTransfer);
        System.out.println(name + " left " + petToTransfer.getName() + " with " + caretaker.name);
    }
    
    public void retrievePetFrom(Person caretaker) {
        if (!caretaker.hasPet()) {
            System.out.println(caretaker.name + " doesn't have a pet to return");
            return;
        }
        
        if (hasPet()) {
            System.out.println(name + " already has a pet");
            return;
        }
        
        Animal petToReturn = caretaker.getPet();
        caretaker.removePet();
        this.assignPet(petToReturn);
        System.out.println(name + " retrieved " + petToReturn.getName() + " from " + caretaker.name);
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        String petInfo = hasPet() ? "Pet: " + pet.toString() : "No pet";
        return name + " (" + getOccupation() + ", " + age + " years) - " + petInfo;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && 
               Objects.equals(name, person.name) && 
               Objects.equals(pet, person.pet);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age, pet);
    }
}