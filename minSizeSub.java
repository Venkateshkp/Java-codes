import java.util.Scanner;
public class minSizeSub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i <= nums.length; i++){
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        int len = nums.length;
        int ans = 0;
        for (int i = 0; i < sum.length; i++) {
            int count = 1;
            for (int j = i + 1; j < sum.length; j++) {
                if (sum[j]-sum[i]==target && count < len){
                    len = count;
                    ans = 1;
                    System.out.println(ans);
                }
                count++;
            }
        }
        if(ans == 0){
            System.out.print(0);
        }
        else{
            System.out.print(len);
        }
    }
}
