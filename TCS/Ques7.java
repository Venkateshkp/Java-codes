package TCS;

import java.util.*;
public class Ques7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count =  0;
        Set<Integer> value = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            value.add(arr[i]);
        }
        for(int i=0; i<n; i++){
            if(value.contains(arr[i]+k)){
                count++;
            }
        }
        System.out.print(count);
    }
}
