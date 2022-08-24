package Recursion;

public class Reversenumber {
    public static void main(String[] args) {
        reverse(5);
    }
    static void reverse(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        // reverse(--n); 
        reverse(n-1);
        // n-- pass the value of n and then subtract  
    }
}
