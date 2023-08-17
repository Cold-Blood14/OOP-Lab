#include <iostream>
#include <cassert>
using namespace std;
class Calculator
{
    int a,b,result;
    char c;
public:
    void setter(int x,int y)
    {
        a=x;
        b=y;
    }
    void setchar(char a)
    {
        c=a;
    }
void Calculate(){
    switch(c)
    {
    case '+':
        result=a+b;
        break;
    case '-':
        result=a-b;
        break;
    case '*':
        result=a*b;
        break;
    case '/':
        assert(b!=0);
        result=a/b;
        break;
    case '%':
        result=a%b;
        break;
    default:
        cout<<"Invalid Symbol";
        break;
    }}
void showoperands(){printf("The operands are %d and %d",a,b);}
void showoperator(){printf("\nThe operator is %c",c);}
void showresult(){printf("\nThe result of the operation is %d",result);}
};
int main()
{
    Calculator X;
    int a,b;
    char c;
    cout<<"Enter the numbers: ";
    cin>>a>>b;
    X.setter(a,b);
    cout<<"Enter the operator: ";
    cin>>c;
    X.setchar(c);
    X.showoperands();
    X.showoperator();
    X.Calculate();
    X.showresult();
    return 0;
}
