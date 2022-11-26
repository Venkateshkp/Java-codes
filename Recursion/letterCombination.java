package Recursion;
import java.util.*;
public class letterCombination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String digits = in.next();
        System.out.print(lc("", digits));
    }
    static ArrayList<String> lc(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch = (char) ('a'+i);
            list.addAll(lc(p+ch, up.substring(1)));
        }
        return list;
    }
}
