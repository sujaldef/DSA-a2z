#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cmath>

using namespace std;

int main() {
int i,j;
    int n=8;
    for(i=0;i<n;i++)
    {
  // spaces
        for(j=0;j<i;j++)
    {
        cout<<" ";
    }
    // stars   
    for(j=1;j<2*(n-i);j++)
    {
        cout<<"*";
    }
 
        cout<<endl;
    }

    return 0;
}