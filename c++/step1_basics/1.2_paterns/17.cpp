#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cmath>

using namespace std;

int main() {
    int n=3,i,j;

    for(i=0;i<=n;i++)
    {
        char c = 'A';
        //  spaces
        for(j=0;j<=n-i-1;j++)
        {
            cout<<" ";
        }
        // stars
        for(j=0;j<2*i-1;j++){

            cout<<c<<" ";
            c=c+1;

        }

        cout<<endl;
    }
}
