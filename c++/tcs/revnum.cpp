#include <iostream>
#include <cmath>
using namespace std;


int main() {
    int n=2342;
int rev=0;
    while(n>0){
int dig=n%10;
rev=rev*10+dig;
n=n/10;
    }
    cout<<rev;
    return 0;
}