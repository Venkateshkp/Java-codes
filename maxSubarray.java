public class maxSubarray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        int ans = printSubArrays(nums, 0, 0, 0, min);
        System.out.println(ans);
    }
    static int printSubArrays(int[] nums, int start, int 
     end, int sum, int max){
        // if (end == nums.length){
        //     return max;
        // }
        int temp = 0;
        if (start > end){
            temp = max;
            printSubArrays(nums, 0, end + 1, 0, max);
        }
        else if(end < nums.length){
            temp = max;
            for (int i = start; i < end; i++){ 
                sum = sum + nums[i];
            }
            sum = sum + nums[end];
            if(sum > max){
                max = sum;
                System.out.println(max);
            }
            printSubArrays(nums, start + 1, end, 0, max); 
        }
        return max;
    }
}
