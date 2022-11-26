package Pattern;
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 2;
        for(int i=1; i<n*2; i++){
            if(i<=n){
                for(int j=1; j<=2*n; j++){
                    if(i==j || j==(2*n)-i){
                        System.out.print(i);
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else{
                for(int j=1; j<=2*n; j++){
                    if((i-count)==j || j==((2*n)-i)+count){
                        System.out.print(i-count + " ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                count=count+2;
                System.out.println();
            }
        }
    }
}
