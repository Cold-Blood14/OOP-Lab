#include <iostream>
using namespace std;
class c2;
class c1{
    int x;
    public: friend int max1(c1 a,c2 b);
    void set1(int a){x=a;}
};
class c2{
    int y;
    public: friend int max1(c1 a,c2 b);
    void set2(int b){y=b;}
};
int max1(c1 a,c2 b){
    return a.x>b.y? a.x : b.y ;
}
int main(){
 c1 g;c2 h;
 int m,n;
 cout<<"Enter Values to compare:\n";
 cin>>m>>n;
 g.set1(m);h.set2(n);
 cout<<"The larger number is "<<max1(g,h);
 return 0;
}

