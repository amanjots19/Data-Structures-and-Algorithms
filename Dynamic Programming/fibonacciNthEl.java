
import java.util.*;
public class fibonacciNthEl{

    public static int fi(int n){
        if(n==0|| n==1){
            return n;
       
            }
    return fi(n-1)+fi(n-2);
    
    
        }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fi(n));
        
    }

    }
    

