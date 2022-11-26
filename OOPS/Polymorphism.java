package OOPS;

class sum{
    int a;
    int b;

    sum(){
        this.a = 13;
        this.b = 15;
    }
    sum(int a, int b){
        this.a = a;
        this.b = b;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        sum obj = new sum();
        System.out.println(obj.a);
        sum obj2 = new sum(18, 15);
        System.out.println(obj2.a);
    }
}
