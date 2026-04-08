package Lab_03.Problem6;

import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {

        Dog dogA = new Dog("Max", 5);
        Dog dogB = new Dog("Charlie", 2);

        Student studentA = new Student("Alice", 20);
        Student studentB = new Student("Bob", 18);

        studentA.assignPet(dogA);
        studentB.assignPet(dogB);

        System.out.println(studentA);
        System.out.println(studentB);

        dogA.train();
        dogB.train();

        Animal[] animalList = {dogA, dogB};
        Arrays.sort(animalList);

        System.out.println("\nSorted Animals:");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }

        Person[] personList = {studentA, studentB};
        Arrays.sort(personList);

        System.out.println("\nSorted People:");
        for (Person person : personList) {
            System.out.println(person);
        }

        Student clonedStudent = (Student) studentA.clone();
        System.out.println("\nCloned: " + clonedStudent);
    }
}