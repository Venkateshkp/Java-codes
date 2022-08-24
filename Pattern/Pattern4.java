package Pattern;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        for(int i=0; i<str.length(); i++){
            for(int j=0; j<str.length(); j++){
                if(j==i){
                    System.out.print(str.charAt(i));
                }
                else if(j==str.length()-i-1){
                    System.out.print(str.charAt(str.length()-i-1));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
