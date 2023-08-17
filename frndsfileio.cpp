#include <iostream>
#include <string>
#include <fstream>
using namespace std;
int main()
{
    int n,x,i,j;
    string txt;
    ofstream write("Details.txt");
    cout<<"How many friends do you have? ";
    cin>>n;
    if(n>0)
        cout<<"Enter their Name and Age:\n";
    else
    {
        cout<<"Get some friends";
        return 0;
    }
    getchar();
    for(i=0; i<n; i++)    {
        getline(cin,txt);
        write<<txt<<endl;
    }
    write.close();
    ifstream read("Details.txt");
    while(getline(read,txt)){
        cout<<"\n"<<txt;
    }
    return 0;
}

