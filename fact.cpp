#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main(){
    unsigned ll int i,x,fact=1;
    cout<<"Enter a number: ";
    cin>>x;
    for(i=2;i<=x;i++)
        fact=fact*i;
    cout<<"The factorial of the number is: "<<fact<<endl;
    return 0;
}


