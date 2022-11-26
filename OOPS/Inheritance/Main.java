package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box obj = new Box();
        System.out.println(obj.l);
        System.out.println(obj.w);
        System.out.println(obj.h);
        BoxWeight obj1 = new BoxWeight();
        System.out.println(obj1.w);

        BoxWeight obj2 = new BoxWeight();
        System.out.println(obj2.w); 
    }
}
