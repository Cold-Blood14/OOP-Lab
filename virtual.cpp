#include <iostream>
using namespace std;
class base{
public:
    virtual void Sound_Function(){cout <<"This is base's Sound Function().\n";}
};
class derived1: public base{
public:void Sound_Function(){ cout<<"This is Derived1's Sound Function().\n";};
};
class derived2: public base{
    public:void Sound_Function(){ cout<<"This is Derived2's Sound Function().\n";};
};
int main(){
base *p;
derived1 d1; derived2 d2;
p=&d1;
p->Sound_Function();
p=&d2;
p->Sound_Function();
return 0;

}
