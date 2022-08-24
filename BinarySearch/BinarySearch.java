import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(binarySearch(n, arr, target));
        in.close();
    }
    static int binarySearch(int n, int[] arr, int target){
        int start = 0;
        int end = n-1;

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
}
