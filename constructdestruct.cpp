#include <iostream>
#include <cstdio>
//2252421017_A_Spondon
using namespace std;
class fib
{
public:
    int x,y;
    fib()
    {
        cout<<"Constructor Invoked\n";
    }
    ~fib()
    {
        cout<<"Destructor Invoked\n";
    }
};
int main()
{
    {
        fib f1;
        {
            fib f2;
        }
    }
    return 0;
}

