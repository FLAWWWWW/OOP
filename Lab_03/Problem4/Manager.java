package Lab_03.Problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {
    Vector<Employee> employees = new Vector<>();
    double bonus;

    Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
    }

    Manager(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = 0;
    }

    double getBonus()               { return bonus; }
    Vector<Employee> getEmployees() { return employees; }
    void setBonus(double bonus)     { this.bonus = bonus; }
    void addEmployee(Employee e)    { employees.add(e); }
    void removeEmployee(Employee e) { employees.remove(e); }

    @Override
    public String toString() {
        return String.format("Manager{name='%s', salary=%.2f, hireDate=%s, insuranceNumber='%s', bonus=%.2f, teamSize=%d}",
                name, salary, hireDate.toString(), insuranceNumber, bonus, employees.size());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Manager manager = (Manager) obj;
        return bonus == manager.bonus && employees.equals(manager.employees);
    }

    @Override
    public int compareTo(Employee other) {
        if (!(other instanceof Manager)) {
            return super.compareTo(other);
        }
        Manager m = (Manager) other;
        int salaryCompare = Double.compare(this.salary, m.salary);
        if (salaryCompare != 0) return salaryCompare;
        return Double.compare(this.bonus, m.bonus);
    }

    @Override
    public Manager clone() {
        Manager cloned = (Manager) super.clone();
        cloned.employees = new Vector<>();
        for (Employee e : this.employees) {
            cloned.employees.add(e.clone());
        }
        return cloned;
    }
}