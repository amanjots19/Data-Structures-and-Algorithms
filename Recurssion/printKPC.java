import java.io.*;
import java.util.*;

public class printKPC {
    public static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str= sc. next();
        printKPC1(str, 0, "");
    }

    public static void printKPC1(String str, int idx, String ans) {
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(idx);
        String code = codes[ch-'0'];
        for(int i=0; i< code.length() ; i++){
            char c = code.charAt(i);
            printKPC1(str, idx+1, ans+c);
        }
        
        return;
        
    }

}
