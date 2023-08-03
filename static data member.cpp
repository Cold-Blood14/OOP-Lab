#include <iostream>
#include <cstdio>
using namespace std;
class Widget
{
public:
    int cnt1=0;
    Widget()
    {
        ++cnt;
        ++cnt1;
    };
    ~Widget()
    {
        --cnt;
        --cnt1;
    };
    static int cnt;
};  int Widget::cnt=0;
int main()
{
    Widget x,w;
    printf("Now there are %d static widgets and %d local widgets.\n",x.cnt,x.cnt1);
        {
            Widget w,x,y,z;
            printf("Now there are %d static widgets and %d local widgets.\n",w.cnt,w.cnt1);
        }
    printf("Now there are %d static widgets and %d local widgets.\n",w.cnt,w.cnt1);
    Widget y;
    printf("Now there are %d static widgets and %d local widgets.\n",w.cnt,w.cnt1);
    return 0;
}

