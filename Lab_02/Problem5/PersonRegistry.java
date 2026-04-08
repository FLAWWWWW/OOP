package Lab_02.Problem5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people;
    
    public PersonRegistry() {
        people = new ArrayList<>();
    }
    
    public void addPerson(Person person) {
        if (!people.contains(person)) {
            people.add(person);
            System.out.println("Added: " + person.getName());
        } else {
            System.out.println(person.getName() + " already exists in registry");
        }
    }
    
    public void removePerson(Person person) {
        if (people.remove(person)) {
            System.out.println("Removed: " + person.getName());
        } else {
            System.out.println(person.getName() + " not found in registry");
        }
    }
    
    public List<Person> findPeopleWithPets() {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.hasPet()) {
                result.add(p);
            }
        }
        return result;
    }
    
    public List<Person> findPeopleWithoutPets() {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (!p.hasPet()) {
                result.add(p);
            }
        }
        return result;
    }
    
    public Person findPersonByName(String name) {
        for (Person p : people) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
    
    public List<Animal> getAllPets() {
        List<Animal> pets = new ArrayList<>();
        for (Person p : people) {
            if (p.hasPet()) {
                pets.add(p.getPet());
            }
        }
        return pets;
    }
    
    public void printRegistry() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person Registry:\n");
        for (Person p : people) {
            sb.append("  ").append(p).append("\n");
        }
        return sb.toString();
    }
}