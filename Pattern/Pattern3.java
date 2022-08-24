package Pattern;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==i){
                    System.out.print(i+1);
                }
                else if(j==n-i-1){
                    System.out.print(n-i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
