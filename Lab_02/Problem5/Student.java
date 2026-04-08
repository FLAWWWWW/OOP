package Lab_02.Problem5;

import java.util.Objects;

public class Student extends Person {
    private String major;
    private int studentId;
    
    public Student(String name, int age, String major, int studentId) {
        super(name, age);
        this.major = major;
        this.studentId = studentId;
    }
    
    @Override
    public String getOccupation() {
        return "Student - " + major;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public int getStudentId() {
        return studentId;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }
    
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
               Objects.equals(major, student.major);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), major, studentId);
    }
}