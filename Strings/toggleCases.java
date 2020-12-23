import java.io.*;
import java.util.*;

public class toggleCases {

	public static String toggleCase(String str){
		StringBuilder s=new StringBuilder();
		for(int i=0;i<=str.length()-1;i++){
		    char ch=str.charAt(i);
		    if(ch>='a'&&ch<='z'){
		        s.append((char)(ch-'a'+'A'));
		    }else s.append((char)(ch-'A'+'a'));
		}

		return s.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);+
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
