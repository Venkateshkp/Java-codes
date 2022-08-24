import java.util.Scanner;
import java.util.Arrays;
public class Firstandlast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        int[] arr1 = new int[2];
        arr1[0] = firstOccurance(nums, target);
        arr1[1] = lastOccurance(nums, target);
        System.out.println(Arrays.toString(arr1));
        in.close();
    }
    static int firstOccurance(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
        }
        return ans;
    }
    static int lastOccurance(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
        }
        return ans;
    }
}
