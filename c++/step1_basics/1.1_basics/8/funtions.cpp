#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cmath>

using namespace std;
void sum(int a, int b)
{
    int sum=a+b;
    cout<<sum;
}

void count(int n,int start)
{
    for(int i=start;i<=n;i++)
    {
        cout<<i<<" ";
    }
}
void printevennum(int n , int start)
{
    for(int i=start;i<=n;i++)
    {
        if((i%2)==0)
        {cout<<i<<" ";}
        
    }
}
void sumofnum(int n , int start)
{
    int sum=0;
        for(int i=start;i<=n;i++)
    {
        
        sum+=i;
    }
    cout<<sum;
}
void changeValue(int x){
    x = x + 10;
    cout << "Inside changeValue(): " << x << endl;
}

// CALL BY REFERENCE
void changeReference(int &x){
    x = x + 10;
    cout << "Inside changeReference(): " << x << endl;
}

int main() {

    // sum(4,4);
    // count(10,1);
    // printevennum(10,1);
// sumofnum(5,1);
    int a = 5;

    cout << "Original a = " << a << endl;

    changeValue(a);
    cout << "After changeValue(): " << a << endl;

    cout << endl;

    changeReference(a);
    cout << "After changeReference(): " << a << endl;

    return 0;
}
//  Call by Value
// function gets COPY of variable
// original does NOT change

//  Call by Reference
// function gets REAL variable
// original DOES change