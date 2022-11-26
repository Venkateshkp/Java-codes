package TCS;

public class Ques8 {
    public static void main(String args[]){
        String str = "abcde";
        int count = 1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == 'a'+i){
                count++;
            }
        }
        System.out.print(count);
    }
}
