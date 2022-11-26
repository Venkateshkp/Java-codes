package TCS;
import java.util.*;
public class Ques3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int count = 0;
        for(int i=0; i<=str.length()-3; i++){
            if(str.charAt(i) == 'H'){
                boolean letter1 = false;
                boolean letter2 = false;
                for(int j=i+1; j<str.length(); j++){
                    if(str.charAt(j) == 'S'){
                        letter1 = true;
                    }
                    if(str.charAt(j) == 'L'){
                        letter2 = true;
                    }
                }
                if(letter1==true && letter2==true){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
