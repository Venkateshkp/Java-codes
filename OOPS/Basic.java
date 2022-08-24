package OOPS;

class Student{
    int rno;
    String name;
    float mark;

    Student(int rno, String name, float mark){
        this.rno = rno;
        this.name = name;
        this.mark = mark;
    }
}
public class Basic {
    public static void main(String[] args) {
 
        Student venkat = new Student(455, "venkatesh", 4.56);

        System.out.println(venkat.rno);
        System.out.println(venkat.name);
        System.out.println(venkat.mark);
    }
}


