package Recursion;
import java.util.Scanner;
public class Sortedarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int i=0;
        System.out.println(sorted(i, n, arr));   
    }
    static boolean sorted(int i, int n, int[] arr){
        if(i == n-1){
            return true;
        }
        else if(arr[i] > arr[i+1]){
            return false;
        }
        return sorted(i+1, n, arr);
    }
}
