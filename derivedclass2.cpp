#include <iostream>
using namespace std;
class A1
{
protected:
    int i,j;
public:
    void set1(int a, int b)
    {
        i=a;
        j=b;
    };
    void show()   {    cout<<i << " "<<j<<"\n";    }
};
class A2 : public A1
{
    int k;
public:
    void setk() {     k=i*j;    }
    void showk(){     cout<<k<<"\n";     }
};
class A3 : public A2{
int m;
public:
    void setm(){m=i-j;}
    void showm(){cout<<m<<"\n";};
};
int main()
{
    A2 ob1;
    A3 ob2;
    ob1.set1(1,2);
    ob1.show();
    ob2.set1(3,4);
    ob2.show()
    ob2.showm();
    return 0;
}
