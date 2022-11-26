package TCS;
import java.util.*;
public class Ques6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char ch = '0';
        for(int i=0; i<10; i++){
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            System.out.print(count + " ");
            ch++;
        }
    }
}
