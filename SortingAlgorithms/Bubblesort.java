package SortingAlgorithms;
import java.util.Arrays;
import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(sortedArray(n, arr)));
        in.close();
    }
    static int[] sortedArray(int n, int[] arr){
        for(int i=0; i<n; i++){
            for(int j=1; j<n-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
