package Recursion;
import java.util.Scanner;
public class Binarysearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int start = 0;
        int end = n-1;
        System.out.println(binarySearch(n, arr, target, start, end));
        in.close();
    }
    static int binarySearch(int n, int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return binarySearch(n, arr, target, start, mid-1);
        }
        else{
            return binarySearch(n, arr, target, mid+1, end);
        }
    }
}
