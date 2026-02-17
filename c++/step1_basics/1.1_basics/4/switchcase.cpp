#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cmath>

using namespace std;

int main() {

    // calculator 
    char op;
    int a,b,i;
    cout<<"Enter the operator:(+,-,*,/) "<<endl;
    cin>>op;
    cout<<"Enter the two numbers: "<<endl;
    cin>>a>>b;
switch(op)
{
    case '+':
    cout<<"the sum is "<<a+b<<endl;
    break;
    case '-':       
    cout<<"the difference is "<<a-b<<endl;
    break;
    case '*':
    cout<<"the product is "<<a*b<<endl;
    break;
    case '/':
    if(b!=0)
    cout<<"the quotient is "<<a/b<<endl;
    else
    cout<<"division by zero is not allowed "<<endl;
    break;
    default:
    cout<<"invalid operator "<<endl;
}

    return 0;
}