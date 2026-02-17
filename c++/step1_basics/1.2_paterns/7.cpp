#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cmath>

using namespace std;

// int main() {


//     int n=8;
//     for(int i=1;i<=n;i++)
//     {
//         for(int j=1;j<=n-i;j++)
//         {
//             cout<<" ";
//         }
//         for(int j=0;j<i;j++)
//         {
//             cout<<"*";
//         }
//  for(int j=1;j<i;j++)
//         {
//             cout<<"*";
//         }
//         cout<<endl;
//     }

//     return 0;
// }

// optimized 
int main() {
    int n=8,i,j;

    for(i=1;i<=n;i++)
    {
        // spaces
        for(j=0;j<n-i;j++)
            cout<<" ";

        // stars
        for(j=0;j<2*i-1;j++)
            cout<<"*";

        cout<<endl;
    }
}
