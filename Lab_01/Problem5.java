package Lab_01;

import java.util.Vector;

public class Problem5 {
    public static void main(String[] args){
        Person boy = new Person(Gender.BOY);
        Person girl = new Person(Gender.GIRL);

        DragonLaunch dragonL= new DragonLaunch();

        dragonL.kidnap(boy);
        dragonL.kidnap(boy);
        dragonL.kidnap(girl);
        dragonL.kidnap(girl);
        // dragonL.kidnap(girl);

        dragonL.peopleEscape();

        if(dragonL.willDragonEatOrNot()){
            System.out.println("Yes, he will");
            System.err.println(String.format("He will eat %d person(s)", dragonL.people.size()));
        } 
        else System.out.println("No, he won't");
    }
}

enum Gender{
    GIRL,
    BOY
}

class Person{
    Gender gender;

    Person(Gender gender){
        this.gender = gender;
    }
}

class DragonLaunch{
    Vector<Person> people = new Vector<Person>();

    DragonLaunch(){}

    void kidnap(Person p){
        people.add(p);
    }

    boolean willDragonEatOrNot(){
        if(people.isEmpty()) return false;
        return true;
    }

    void peopleEscape(){
        int i = 0;
        
        while(i < people.size() - 1){
            Person current = people.get(i);
            Person next = people.get(i + 1);

            if(current.gender == Gender.BOY && next.gender == Gender.GIRL){
                
                people.remove(i + 1);
                people.remove(i);

                i = Math.max(0, i - 1);
            }

            else i++;
        }
    }
}