package Inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box();
        // Box box1 = new Box(4.5, 7.2, 3.2);
        Boxweight box2 = new Boxweight();
        // System.out.println(box.l);
        // System.out.println(box1.l);
        Boxweight box3 = new Boxweight(4.5, 2.3, 5.2);
        System.out.println(box3.l);
        System.out.println(box3.w);
    }
}
