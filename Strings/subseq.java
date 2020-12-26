import java.util.*;
public class subseq{
    public static ArrayList<String> sseq(String str){
        ArrayList<String> ans=new ArrayList<>();
        ans.add("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int size=ans.size();
            for(int j=0;j<size;j++){
                ans.add(ans.get(i)+ch);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        sseq("abcd");
    }

}