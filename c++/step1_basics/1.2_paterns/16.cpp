#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cmath>

using namespace std;

int main() {

int n=5;
char c = 'A';
    for(int i=0;i<n;i++)
    {   
        for(int j=0;j<=i;j++)
        {
            cout<<c<<" ";
        }
        c=c+1;

        cout<<endl;
    }
    return 0;
}