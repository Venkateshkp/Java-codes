package Hashmap;
import java.util.HashMap;
public class Example1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        hash.put("a", 10);
        hash.put("b", 20);
        hash.put("c", 30);
        System.out.println(hash.keySet());
        System.out.println(hash.replace("a", 10, 30));  
        System.out.println(hash);     
    }
}
