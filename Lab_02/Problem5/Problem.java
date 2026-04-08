package Lab_02.Problem5;

public class Problem {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer", 50000);
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", 1, "Why I can't have dogs", "IDK");
        Animal murka = new Cat("Murka", 5);

        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        john.leavePetWith(alice);
        System.out.println(registry);

        john.retrievePetFrom(alice);
        System.out.println(registry);
    }
}