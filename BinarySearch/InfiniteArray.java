import java.util.Scanner;
public class InfiniteArray {
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
        int end = 1;
        
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end-start+1) * 2;
            start = temp;
        }
        return binarySearch(start, end, arr, target);
    }
    static int binarySearch(int start, int end, int[] arr, int target){
        while(start <= end){
            int mid = start+ (end-start)/2;

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
}
