package TCS;
import java.util.*;
public class Ques4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = str.length();
        int num = 0;
        int x = 1;
        int i;
        for(i=n-1; i>=0; i--){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                num = (str.charAt(i)-'0') * x + num;
                x = x*10;
            }
            else{
                break;
            }
        }
        if((i+1) == num){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
}
