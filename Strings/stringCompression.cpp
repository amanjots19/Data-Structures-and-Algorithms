#include<iostream>
using namespace std;

string compression2(string str){
    string s="";
    s.push_back(str[0]);
    int i=0;
    while(i<str.length()){
        int count=1;
        while(i<=str.length()&& str[i-1]==str[i]){
            count++;
            i++;
        }
        if(count>1){
            s.push_back(count);
        }
        if(i<str.length()){
            s.push_back(str[i]);
            i++;
        }
    }
    return s;
}
string compression1(string str){
    string s="";
    s.push_back(str[0]);
    int i=0;
    while(i<str.length()){
        while(i<=str.length()&& str[i-1]==str[i]){
            i++;
        }
        if(i<str.length()){
            s.push_back(str[i]);
            i++;
        }
    }
    return s;
}
int Main{
    string str="";
    cin>>str;
    cout<< compression1(str)<< endl;
    cout<< compression2(str)<< endl;
}