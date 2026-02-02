package practice_02;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name = input.next();
        String id = input.next();

        Student flaw = new Student(name, id);
        Student another = new Student();

        flaw.get_info();
        flaw.increment_year();

        another.set_name(flaw.name);
        another.set_id(flaw.id);
        another.set_year(flaw.year_of_study);
        
        flaw.increment_year();
        another.increment_year();

        flaw.get_info();
        another.get_info();
    }
}


class Student {
    String name;
    String id;
    int year_of_study = 0;

    Student() { }

    Student(String n, String i){
        name = n;
        id = i;
    }

    void get_info(){
        System.out.print("\nName: " + name + "\nId: " + id + "\nYear of study: " + year_of_study);
    }

    String get_name(){ return name; }
    String get_id(){ return id; }
    int get_year(){ return year_of_study; }

    void set_name(String n){ name = n; }
    void set_id(String i){ id = i; }
    void set_year(int y){ year_of_study = y; }

    void increment_year() { year_of_study++; }
}