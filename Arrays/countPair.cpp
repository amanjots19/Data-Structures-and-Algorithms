    
class Solution{   
    int getPairsCount(int arr[], int n, int k) {
        int count=0;
        for(int i=0;i<arr.size()-1;i++){
            for(int j=1;j<arr.size();j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
            return count;
            
    }
 }