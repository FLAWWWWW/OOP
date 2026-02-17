package practice_02;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name = input.next();
        String id = input.next();

        Student flaw = new Student(name);
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


