#include <iostream>
#include <cstdio>
//2252421017_A_Spondon
using namespace std;
class fib
{
public:
    int x,y;
    fib(int x,int y)
    {
        this->x=x;
        this->y=y;
    }
    void fibser(int n)
    {
        if(n==1) cout<<x;
        if(n==2) cout<<y;
        else cout<<x<<' '<<y;
        for(int i=2; i<n; i++)
        {
            int sum=x+y;
            cout<<' '<<sum;
            x=y;
            y=sum;

        }
    }
};
int main()
{
    fib f1(0,1);int n;
    cout<<"Enter the number of terms in the series: ";
    cin>>n;
    f1.fibser(n);
    return 0;
}
