#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cmath>

using namespace std;

int main() {
 int n,i;
 cin>>n;
    char arr[100];
    for(i=0;i<n;i++)
    {
cin>>arr[i];
    }
    // cout<<"the characters you entered are "<<endl;
    // for(i=0;i<n;i++)
    // {
    //     cout<<arr[i]<<" ";
    // }
int a=0,b=0,c=0;
for(i=0;i<n;i++)
{
    if(arr[i]=='a')
    a++;
    else if(arr[i]=='b')
    b++;
    else if(arr[i]=='c')
    c++;
}
cout<<"number of a is "<<a<<endl;
cout<<"number of b is "<<b<<endl;
cout<<"number of c is "<<c<<endl;
    return 0;
}