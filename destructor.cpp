#include <iostream>
using namespace std;
class Ratio{
    int x,y;
public:
    Ratio(){cout<<"Object born.\n";}
    void setval(int x,int y)
    {
        this->x=x;
        this->y=y;
    }
    void display(){cout<<"The values are "<<x<<" "<<y;}
    ~Ratio(){cout<<"\nObject dies.\n";}
};
int main(){
    {
        Ratio X;
        cout<<"Now X is alive.\n";
        X.setval(3,4);
        X.display();
    }
    cout<<"\nNow between blocks.\n\n";
    {
        Ratio Y;
        cout<<"Now Y is alive.\n";
        Y.setval(3,4);
        Y.display();
    }
    return 0;
}
