package OOPS.Example1;

public class Human {
    int age;
    String name;
    int salary;
    float mark;
    static int population;

    Human(int age, String name, int salary, float mark){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.mark = mark;
        Human.population+=1;
    }
}
