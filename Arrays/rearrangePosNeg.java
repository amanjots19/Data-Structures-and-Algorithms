import java.util.*;
public class rearrangePosNeg{
    public static int[] rotation(int arr[], int left , int right){
        int temp =0;
        int i=right,j=i-1;
        while(i<left && j<=left){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i--;
            j--;
        }
        return arr;
    }
    public static int isPresent(int arr[], int start){
        for(int i=start;i<arr.length;i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }
    public static void solution(int arr[]){
        int n=arr.length;
        int i,j;
        if(arr[0]<0){
            i=1;
            j=i+1;
        }else{
            i=0;
            j=i+1;
        }
        while(i<n&& j<n){
            int num=isPresent(arr,i);
            if(num!=-1){
                rotation(arr,i,num);
                if(arr[i+1]>0){
                    i+=2;
                }else{
                    i+=1;

                }
            }else{
                System.out.println(arr);
                break;
            }
        }

    }
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,-1,3,-2,3};
        solution(arr);
    }
    
}