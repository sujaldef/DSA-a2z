#include <iostream>
#include <cmath>
using namespace std;


int main() {
    int n=12;
    int a=0;
    int b=1;
for(int i=1;i<=n;i++)
{
    cout<<a<<" ";
    int c=a+b;
    a=b;
    b=c;
}
return 0;
}