package OOPS.Statickeyword;

public class Human {
    String name;
    int rollno;
    float mark;
    static long population;

    Human(String name, int rollno, float mark){
        this.name = name;
        this.rollno = rollno;
        this.mark = mark;
        Human.population+=1;
    }                           
}

