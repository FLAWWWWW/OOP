package Lab_03.Problem4;

import java.util.Date;

public class Problem4 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Alice",   50000, new Date(2020 - 1900, 1, 1),  "IN001");
        Employee e2 = new Employee("Bob",     70000, new Date(2018 - 1900, 5, 15), "IN002");
        Employee e3 = new Employee("Charlie", 60000, new Date(2019 - 1900, 3, 10), "IN003");
        Employee e4 = new Employee("Diana",   70000, new Date(2021 - 1900, 7, 20), "IN004");

        Manager m1 = new Manager("Eve",   70000, new Date(2017 - 1900, 2, 5),  "IN005", 5000);
        Manager m2 = new Manager("Frank", 70000, new Date(2016 - 1900, 8, 25), "IN006", 8000);

        m1.addEmployee(e1);
        m1.addEmployee(e2);
        m2.addEmployee(e3);
        m2.addEmployee(e4);

        System.out.println(e1);
        System.out.println(m1);

        System.out.println("e2.equals(e4): " + e2.equals(e4));
        System.out.println("e1.equals(e1): " + e1.equals(e1));

        System.out.println("e1 vs e2: " + e1.compareTo(e2));
        System.out.println("m1 vs m2: " + m1.compareTo(m2));

        Employee employeeClone = e1.clone();
        System.out.println("employeeClone: " + employeeClone);
        System.out.println("e1 == employeeClone: " + (e1 == employeeClone));
        System.out.println("e1.equals(employeeClone): " + e1.equals(employeeClone));

        Manager m1Clone = m1.clone();
        System.out.println("m1Clone: " + m1Clone);
        System.out.println("m1 == m1Clone: " + (m1 == m1Clone));
        System.out.println("m1.employees == m1Clone.employees: " + (m1.employees == m1Clone.employees));
    }
}