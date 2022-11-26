package OOPS;

public class StaticVariable {
    public static void main(String[] args) {
        Test a = new Test("venkat");
        Test b = new Test("yokesh");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
class Test{
    static String name;
    // String name;
    Test(String name){
        Test.name = name;
        // this.name = name;
    }
}
