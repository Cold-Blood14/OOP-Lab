#include <iostream> //2252421017_A_Spondon_Labreport2
using namespace std;
class base
{
    int i,j;
public:
    void set1()    {   cin>>i>>j;  };
    int product()  {   return i*j;    }
};
class rectangle : public base
{ public:
    rectangle(){cout<<"Enter the length and breadth:\n";}
    int rectarea(){ return product(); }
};
class triangle : public base
{   public:
    triangle(){cout<<"Enter the base and height:\n";}
    int triarea(){return product()/2;}
};
int main()
{
    rectangle rect1;
    rect1.set1();
    cout<<"\nArea of the rectangle is: "<<rect1.rectarea()<<"\n\n";
    triangle tri1;
    tri1.set1();
    cout<<"\nArea of the triangle is: "<<tri1.triarea()<<endl;
    return 0;
}

