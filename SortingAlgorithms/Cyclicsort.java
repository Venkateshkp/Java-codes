package SortingAlgorithms;
import java.util.Scanner;
import java.util.Arrays;
public class Cyclicsort {
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
        int i=0;
        while(i < n){
            int correct = arr[i]-1;
            if(arr[i] >= 0 && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        return arr;
    } 
}
