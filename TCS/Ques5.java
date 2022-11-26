package TCS;
import java.util.*;
public class Ques5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int minPrice = arr[0];
        int maxPrice = 0;
        for(int i=0; i<n; i++){
            minPrice = Math.min(minPrice, arr[i]);
            maxPrice = Math.max(maxPrice, arr[i]-minPrice);
        }
        System.out.print(maxPrice);
    }
}
