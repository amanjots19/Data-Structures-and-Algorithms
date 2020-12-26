#include<iostream>

using namespace std;

void subString(String str){
        for(int i=0;i<str.length()-1;i++){
            for(int j=1;i+j<str.length()-1;j++){
                cout << str.substr(i,j)<<endl;
            }
        }
    }

int Main{
    subString('abcdef')
    return 0;

}