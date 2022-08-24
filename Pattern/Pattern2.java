package Pattern;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int originalN = n;
        n = 2*n;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                // int ans = Math.min(Math.min(i, j), Math.min(n-i, n-j));
                int ans = originalN - Math.min(Math.min(i, j), Math.min(n-i, n-j));
                System.out.print(ans + " ");
            }
            System.out.println();
            in.close();
        }
    }
}
