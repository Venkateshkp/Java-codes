package Recursion;
import java.util.Scanner;
public class Findtarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int index = 0;
        System.out.println(findTarget(n, arr, target, index));
    }  
    static boolean findTarget(int n, int[] arr, int target, int index){
        if(index == n){
            return false;
        }
        else{
            return arr[index]==target || findTarget(n, arr, target, index+1);
        }
    }
}
