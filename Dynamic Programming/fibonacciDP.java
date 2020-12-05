import java.io.*;
import java.util.*;

public class fibonacciDP{

public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(fb(n,new int[n+1]));
    
 }
public static int fb(int n, int[] qb){
    if(n==0|| n==1){
        return n;
    }
    if(qb[n]!=0){
        return qb[n];
    }
    int fbn1=fb(n-1,qb);
    int fbn2=fb(n-2,qb);
    int sum=fbn1+fbn2;
    qb[n]=sum;
    return sum;
}
}