package OOPS.Example1;
public class Main {
    public static void main(String args[]){
        Human venkat = new Human(18, "venkat", 25000, 5.6f);
        Human yokesh = new Human(18, "yoeksh", 25000, 5.6f);

        System.out.println(venkat.age);
        System.out.println(venkat.name);
        System.out.println(venkat.salary);
        System.out.println(venkat.mark);
        System.out.println(venkat.population);
    }
}
