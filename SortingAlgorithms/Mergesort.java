package SortingAlgorithms;
import java.util.Arrays;
import java.util.Scanner;
public class Mergesort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return merge(left, right);
    }
    private static int[] merge(int[] left, int[] right){
        int[] ans = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                ans[k] = left[i];
                i++;
            }
            else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
}
