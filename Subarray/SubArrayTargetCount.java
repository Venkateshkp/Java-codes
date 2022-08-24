package Subarray;

public class SubArrayTargetCount {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int target = 2;
        System.out.println(checkTarget(arr, target));
    }
    static int checkTarget(int[] arr, int target){
        // int i = 0;
        // int j = 1;
        // int sum = arr[i] + arr[j];
        // int count = 0;
        // while(i<arr.length-1 && j<arr.length){
        //     if(sum < target){
        //         j++;
        //         sum = sum + arr[j];
        //     }
        //     else if(sum > target){
        //         sum = sum - arr[i];
        //         if(i==arr.length-2){
        //             count++;
        //             break;
        //         }
        //         i++;
        //     }
        //     else{
        //         count++;
        //         i++;
        //         j = i+1;
        //         if(i==arr.length || j==arr.length){
        //             break;
        //         }
        //         sum = arr[i] + arr[j];
        //     }
        // }
        // return count;
        int count = 0;
      
        int[] sum = new int[arr.length + 1];
        sum[0] = 0;
        for (int i = 1; i <= arr.length; i++)
            sum[i] = sum[i - 1] + arr[i - 1];
      
        for (int start = 0; start < sum.length; start++) {
            for (int end = start + 1; end < sum.length; end++) {
                if (sum[end] - sum[start] == target)
                    count++;
            }
        }
      
        return count;
    }
}
