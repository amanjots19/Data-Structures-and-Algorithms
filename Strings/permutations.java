import java.io.*;
import java.util.*;

public class permutations {
    public static ArrayList<String> print(String str){
        ArrayList<String> al = new ArrayList<>();
		al.add("");
		for(int i = 0; i < str.length(); i++){
		    char ch = str.charAt(i);
		    ArrayList<String> smallAns= new ArrayList<>();
		    for(String s : al){
		        for(int j = 0; j<=s.length(); j++){
		            String str2 = s.substring(0,j) + ch + s.substring(j);
		            smallAns.add(str2);
		        }
		    }
		    al=smallAns;
		}
		return al;
    }
	public static void solution(String str){
        ArrayList<String> ans = print(str);
        for(String s: ans){
            System.out.println(s);
        }
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
