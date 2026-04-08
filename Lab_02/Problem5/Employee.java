package Lab_02.Problem5;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person {
    private String jobTitle;
    private double salary;
    
    public Employee(String name, int age, Date jobTitle, String salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    
    @Override
    public String getOccupation() {
        return "Employee - " + jobTitle;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
    
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
               Objects.equals(jobTitle, employee.jobTitle);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jobTitle, salary);
    }
}