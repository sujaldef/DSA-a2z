#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cmath>

using namespace std;

int main() {
int i,j,n=3;
int k=2*n;
   for(i=1;i<=n;i++)
    {

        for(j=0;j<i;j++)
    {
        cout<<"*";
    }
    cout<<endl;
    }
   for(i=1;i<=n;i++)
    {
 
        for(j=n-i;j>0;j--)
    {
        cout<<"*";
    }
    cout<<endl;
    }
    return 0;
}