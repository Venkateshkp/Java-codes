package Recursion;
import java.util.Scanner;
public class Permutations {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // String str = in.next();
        Permutations("", "abc");
    }
    static void Permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            Permutations(f+ch+s, up.substring(1));
        }
    }
}
