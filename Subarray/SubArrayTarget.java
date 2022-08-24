package Subarray;

public class SubArrayTarget {
    public static void main(String[] args) {
        int[] arr = {4, 32, 7, 4, 5};
        int target = 47;
        System.out.println(checkTarget(arr, target));
    }
    static String checkTarget(int[] arr, int target){
        int i = 0;
        int j = 1;
        int sum = arr[i] + arr[j];
        while(i<arr.length-2 && j<arr.length-1){
            if(sum < target){
                j++;
                sum = sum + arr[j];
            }
            else if(sum > target){
                sum = sum - arr[i];
                i++;
            }
            else{
                return "yes";
            }
        }
        return "no";
    }
}