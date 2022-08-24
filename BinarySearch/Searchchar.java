import java.util.Scanner;
public class Searchchar{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char target = in.next().charAt(0);
        System.out.println(search(str, target));
        in.close();
    }
    static int search(String str, char target){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
}