package Pattern;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=2*n; i++){
            // if(i<=5){
            //     for(int j=1; j<=i; j++){
            //         System.out.print("* ");
            //     }
            // }
            // else{
            //     for(int j=i; j<=2*n-1; j++){
            //         System.out.print("* ");
            //     }
            // }
            // System.out.println();
            int k = i<=n ? i : 2*n-i;

            int totalSpaces = n - k;

            for(int s=0; s<totalSpaces; s++){
                System.out.print(" ");
            }

            for(int j=1; j<=k; j++){
                System.out.print("* ");
            } 
            System.out.println();
        }
    }
}
