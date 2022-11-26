import java.util.Scanner;
public class FindTargetInMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = in.nextInt();
                break;
            }
        }
        int target = in.nextInt();
        int ans = 0;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][matrix[0].length-1] >= target){
                ans = findTarget(i, matrix, target);
            }
        }
        if(ans == 1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    static int findTarget(int i, int[][] mat, int target){
        int start = 0;
        int end = mat[0].length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mat[i][mid] == target){
                return 1;
            }
            else if(mat[i][mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return 0;
    }
}