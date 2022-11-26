package TCS;
import java.util.*;
public class Ques2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int count = 0;
        for(int i=n1; i<=n2; i++){
            boolean[] check = new boolean[10];
            int temp = i;
            while(temp != 0){
                if(check[temp%10] == true){
                    break;
                }
                check[temp%10] = true;
                temp = temp/10;
            }
            if(temp == 0){
                count++;
            }
        }
        System.out.print(count);
    }
}
