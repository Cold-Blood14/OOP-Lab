#include <iostream>
using namespace std;
int main(){
    int a,b;
    cout<<"Enter Numbers for division";
    cin>>a>>b;
    try{
        if(b!=0){
            cout<<"The result of division is: "<<a/b;
            return 0;
        }
    else {throw(b);}
    }
    catch (int a){
    cout<<"You cannot divide by 0.";
    }
    return 0;
}
