package Lab_03.Problem4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    double salary;
    Date hireDate;
    String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    Employee(String name, double salary, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = new Date();
        this.insuranceNumber = insuranceNumber;
    }

    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
        this.hireDate = new Date();
        this.insuranceNumber = "N/A";
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary +
                ", hireDate=" + hireDate +
                ", insuranceNumber='" + insuranceNumber + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Employee)) return false;

        Employee e = (Employee) o;

        return salary == e.salary &&
                hireDate.equals(e.hireDate) &&
                insuranceNumber.equals(e.insuranceNumber);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}