package ZOHO;
import java.util.*;
public class Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i] = in.nextInt();
        }
        
        int i=0;
        int j=0;
        int[] ans = new int[n1+n2];
        int k = 0;
        while(i<n1 || j<n2){
            if(i==n1){
                while(j < n2){
                    ans[k] = arr2[j];
                    j++;
                    k++;
                }
                break;
            }
            else if(j == n2){
                while(i < n1){
                    ans[k] = arr1[i];
                    i++;
                    k++;
                }
                break;
            }
            else if(arr1[i] == arr2[j]){
                ans[k] = arr1[i];
                k++;
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j]){
                ans[k] = arr2[j];
                j++;
                k++;
            }
            else if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }
        }
        for(int m=0; m<k; m++){
            System.out.print(ans[m] + " ");
        }
    }
}

