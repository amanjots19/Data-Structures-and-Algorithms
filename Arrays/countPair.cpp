#include<iostream>

using namespace std;

int getPairsCount(int arr[], int n, int k) {
        int count=0;
        int i=0,j=i+1;
        while(i<n&&j<n){
            int r=k-arr[i];
            if(arr[j]==r){
                i++;
                j=i+1;
                count++;
            }else if(j==(n-1)){
                i++;
                j=i+1;
            }else{
                j++;
            }
        }
        return count;
        
}

int main(){
    int n; cin>>n;
    int k; cin>>k;
    int arr[n];
    for(int i = 0; i<n;i++){
        cin>>arr[i];
    }
    cout<< getPairsCount(arr,n,k)<<endl;
    return 0;
}