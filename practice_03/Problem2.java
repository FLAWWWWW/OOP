import java.util.HashSet;
import java.util.Scanner;

class Person {
    protected String name;
    protected String address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address;
    }
}


class Student extends Person {
    private String program;
    private int year;
    private double fee;
    
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    
    public String getProgram() {
        return program;
    }
    
    public void setProgram(String program) {
        this.program = program;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public double getFee() {
        return fee;
    }
    
    public void setFee(double fee) {
        this.fee = fee;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Program: " + program + ", Year: " + year + ", Fee: " + fee;
    }
}

class Staff extends Person {
    private String school;
    private double pay;
    
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    
    public String getSchool() {
        return school;
    }
    
    public void setSchool(String school) {
        this.school = school;
    }
    
    public double getPay() {
        return pay;
    }
    
    public void setPay(double pay) {
        this.pay = pay;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", School: " + school + ", Pay: " + pay;
    }
}

public class Problem2 {
    public static void main(String[] args) {
        int choice;

        HashSet<Person> people = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        people.add(new Person("John Smith", "123 Main Street"));
        people.add(new Student("Alice Johnson", "456 Oak Avenue", "Computer Science", 2, 5000.00));
        people.add(new Staff("Dr. Brown", "789 Pine Road", "Engineering School", 65000.00));
        
        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Add a new person");
            System.out.println("2. Show all persons");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
                case 1:
                    System.out.println("What type of person?");
                    System.out.println("1. Regular Person");
                    System.out.println("2. Student");
                    System.out.println("3. Staff");
                    System.out.print("Enter choice (1-3): ");
                    
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    
                    if (type == 1) {
                        Person p = new Person(name, address);
                        people.add(p);
                        System.out.println("Person " + name + " added successfully!");
                    }
                    else if (type == 2) {
                        System.out.print("Enter program: ");
                        String program = scanner.nextLine();
                        
                        System.out.print("Enter year: ");
                        int year = scanner.nextInt();
                        
                        System.out.print("Enter fee: ");
                        double fee = scanner.nextDouble();
                        
                        Student s = new Student(name, address, program, year, fee);
                        people.add(s);
                        System.out.println("Student " + name + " added successfully!");
                    }
                    else if (type == 3) {
                        System.out.print("Enter school: ");
                        String school = scanner.nextLine();
                        
                        System.out.print("Enter pay: ");
                        double pay = scanner.nextDouble();
                        
                        Staff staff = new Staff(name, address, school, pay);
                        people.add(staff);
                        System.out.println("Staff " + name + " added successfully!");
                    }
                    else {
                        System.out.println("Invalid type! No person added.");
                    }
                    break;
                    
                case 2:
                    if (people.isEmpty()) {
                        System.out.println("No persons found");
                    } else {
                        int count = 1;
                        System.out.println("\nAll Persons: ");
                        for (Person p : people) {
                            System.out.println("\n" + count + ". " + p.toString());
                            count++;
                        }
                        System.out.println("\nTotal: " + people.size() + " person(s)");
                    }
                    break;
                    
                case 3:
                    System.out.println("\nThat was fine, goodbye!");
                    break;
                    
                default:
                    System.out.println("\nInvalid choice");
            }
            
        } while(choice != 3);
        
        scanner.close();
    }
}