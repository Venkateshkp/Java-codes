//1095. Find in Mountain Array
import java.util.Scanner;
public class PeakIndex{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(search(arr, target));
        in.close();
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = peakElement(arr);
        int ans = binarySearch(arr, start, end, target);
        return ans;
    }

    static int binarySearch(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = (start+end) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
        }
        return -1;
    }

    static int peakElement(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}