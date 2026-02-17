package Lab_01;

import java.util.ArrayList;
import java.util.Scanner;

import practice_02.Student;

public class Problem4 {
    public static void main(String[] args){
        String[] studentNames = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        
        ArrayList<String> prerequisites = new ArrayList<>();
        prerequisites.add("PP1");
        prerequisites.add("PP2");
        
        GradeBook gradeBook = new GradeBook(
            studentNames,
            "CS101",
            "Object-oriented Programming and Design",
            3,
            prerequisites
        );
        
        gradeBook.displayMessage();
        
        gradeBook.setStudentsGrades();
        
        System.out.println();
        
        gradeBook.displayGradeReport();
        
        System.out.println();
        
        gradeBook.outputBarChart();
    }
}

class GradeBook{
    Course course;
    ArrayList<Student> students;

    double sum_of_grade;
    double high_grade;
    double low_grade;

    String high_name;
    String low_name;
    String high_id;
    String low_id;

    Scanner input = new Scanner(System.in);

    GradeBook(String[] studentName, String courseName, String courseDesc, int courseCredits, ArrayList<String> coursePreqs) {
        students = new ArrayList<>();
        course = new Course(courseName, courseDesc, courseCredits, new ArrayList<>());

        for (String name : studentName) {
            students.add(new Student(name));
        }

        low_grade = 100;
        high_grade = 0;

        for (String preq : coursePreqs) {
            course.prerequisites.add(preq);
        }
    }


    void displayMessage(){
        System.out.println("Welcome to the grade book for " + course.name + " " + course.description + "!\n");
    }

    void displayGradeReport(){
        System.out.println(String.format("Class average is %.2f", determineClassAverage()));
        System.out.println(String.format("Lowest grade is %.2f (Student %s, id: %s)", low_grade, low_name, low_id));
        System.out.println(String.format("Highest grade is %.2f (Student %s, id: %s)", high_grade, high_name, high_id));
    }

    void setStudentsGrades(){
        double temp_grade;
        System.out.println("Please, input grades for students:\n");
        for (Student student : students) {
            System.out.println("Student " + student.get_name() + ": ");
            temp_grade = input.nextDouble();
            student.set_grade(temp_grade);

            sum_of_grade += temp_grade;

            if(low_grade > temp_grade){
                low_grade = temp_grade;
                low_name = student.get_name();
                low_id = student.get_id();
            }

            if(high_grade < temp_grade){
                high_grade = temp_grade;
                high_name = student.get_name();
                high_id = student.get_id();
            }
        }
    }

    double determineClassAverage(){
        return sum_of_grade/students.size();
    }

    void outputBarChart(){
        printLine("Grades distribution:");

        String result = "";
        for(int i = 0; i < 10; i++){
            int min = 0, max = 9;
            int offset = i * 10;
            min += offset;
            max += offset;

            result += String.format("\n%d-%d: ", min, max);

            for (Student student : students) {
                if(student.get_grade() >= min && student.get_grade() <= max){
                    result += "*";
                }
            }
        }

        result += "\n100: ";
        for (Student student : students) {
            if(student.get_grade() == 100){
                result += "*";
            }
        }

        printLine(result);

    }

    void printLine(String output){
        System.out.println(output);
    }
}

class Course{
    String name;
    String description;
    int credits;
    ArrayList<String> prerequisites;

    Course(String name, String description, int credits,  ArrayList<String> prerequisites){
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }
}