import java.util.*;

public class tribonacci {
    public static int tribonacci1(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        
        int[] arr= new int[n+1];
        
        int t1=tribonacci1(n-1);
        int t2= tribonacci1(n-2);
        int t3=tribonacci1(n-3);
        
        int sum=t1+t2+t3;
        arr[n]=sum;
        
        if(arr[n]!=0){
            return arr[n];
        }
        
        return sum;
    }
    public static void main(String[] args) {
        
        // Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();

        System.out.println(tribonacci1(35));
        
    }
}

