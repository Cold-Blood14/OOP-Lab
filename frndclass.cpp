#include <iostream>
using namespace std;
class myclass{
int a,b;
public: friend class minn;
myclass(int i,int j):a(i),b(j){}
};
class minn{
public: int Min(myclass x){
    return x.a<x.b?x.a:x.b;
}
};
int main(){
    myclass n(5,6);
    minn m;
    cout<<m.Min(n);
    return 0;
}
