package Pattern;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=2*n; i++){
            int space = i<=n ? 2*(n-i) : 2*(i-n);
            int k = i<=n ? i : 2*n -i;

            for(int s=1; s<=space; s++){
                System.out.print(" ");
            }
            for(int j=k; j>=1; j--){
                System.out.print(j + " ");
            }
            for(int l=2; l<=k; l++){
                System.out.print(l + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
