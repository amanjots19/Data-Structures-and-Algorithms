import java.util.*;
import java.io.File;
public class printSubstring{

    public static void ss(String str){
        for(int i=0;i<str.length()-1;i++){
            for(int j=i;j<str.length()-1;j++){
                System.out.println(str.substring(i,j+1));
            }
        }
    }


    public static void main(String[] args){
        ss("aabshdbhfnffj");
    }

} 