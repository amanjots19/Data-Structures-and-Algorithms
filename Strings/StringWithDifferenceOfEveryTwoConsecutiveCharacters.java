import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		if(str.length()<1) return str;
		StringBuilder sb= new StringBuilder();
		sb.append(str.charAt(0));
		for(int i=1;i<=str.length()-1;i++){
		    char ch=str.charAt(i);
		    char ch0=str.charAt(i-1);
		    sb.append(ch-ch0);
		    sb.append(ch);
		    
		    
		}

		return sb.toString();
	}
	public static void main(String[] args) {
