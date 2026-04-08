package Lab_03.Problem4;

public class Person {
    String name;

    Person(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if(name != null && person.name != null) return name.equals(person.name);
        return false;
    }
}
