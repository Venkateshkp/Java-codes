// package Recursion;
// import java.util.Scanner;
// public class RemoveChar1 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         String str = in.nextLine();
//         removeChar("", str);
//     }
//     static void removeChar(String ans, String str){
//         if(str.isEmpty()){
//             System.out.print(ans);
//             return;
//         }
//         else if(str.charAt(0) == 'a'){
//             removeChar(ans, str.substring(1));
//         }
//         else{
//             removeChar(ans+str.charAt(0), str.substring(1));
//         }
//     }
// }
package Recursion;
import java.util.Scanner;
public class RemoveChar1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(removeChar(str));
    }
    static String removeChar(String str){
        if(str.isEmpty()){
            return "";
        }
        else if(str.charAt(0) == 'a'){
            return removeChar(str.substring(1));
        }
        else{
            return str.charAt(0)+removeChar(str.substring(1));
        }
    }
}

