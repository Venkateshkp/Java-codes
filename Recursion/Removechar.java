package Recursion;
import java.util.Scanner;
public class Removechar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String ans = "";
        int i = 0;
        System.out.print(removeChar(str, ans, i));
    }
    static String removeChar(String str, String ans, int i){
        if(i == str.length()){
            return ans;
        }
        else if(str.charAt(i) != 'a'){
            ans = ans + str.charAt(i);
        }
        return removeChar(str, ans, i=i+1);
    }
}
