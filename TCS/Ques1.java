package TCS;
import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        if(k > n){
            k = k%n;
        }

        int ans[] = new int[n];
        for(int i=0; i<k; i++){
            ans[i] = arr[n-k+i];
        }
        int index = 0;
        for(int i=k; i<n; i++){
            ans[i] = arr[index++];
        }
        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
