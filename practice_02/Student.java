package practice_02;

public class Student {
    String name;
    String id = "0";
    int year_of_study = 0;
    double grade = 0;

    Student() { }

    public Student(String name){
        this.name = name;
    }

    public Student(String name, String id, double grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public void get_info(){
        System.out.print("\nName: " + name + "\nId: " + id + "\nYear of study: " + year_of_study);
    }

    public String get_name(){ return name; }
    public String get_id(){ return id; }
    public int get_year(){ return year_of_study; }
    public double get_grade(){ return grade; }

    public void set_name(String n){ name = n; }
    public void set_id(String i){ id = i; }
    public void set_year(int y){ year_of_study = y; }
    public void set_grade(double grade){ this.grade = grade; }

    public void increment_year() { year_of_study++; }
}