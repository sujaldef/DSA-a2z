#include <iostream>
using namespace std;

int main(){

    int n=3;

    // TOP  pyramid
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<n-i;j++)
            cout<<" ";

        for(int j=1;j<=2*i-1;j++)
            cout<<"*";

        cout<<endl;
    }

    // BOTTOM  pyramid
    for(int i=n-1;i>=0;i--)
    {
        for(int j=0;j<n-i;j++)
            cout<<" ";

        for(int j=1;j<=2*i-1;j++)
            cout<<"*";

        cout<<endl;
    }
}
