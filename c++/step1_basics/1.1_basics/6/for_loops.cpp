#include <iostream>
using namespace std;

int main(){

    // 1. Count from 1 to 5
    cout<<"Count up:\n";
    for(int i=1;i<=5;i++){
        cout<<i<<" ";
    }

    // 2. Count backwards
    cout<<"\n\nCount down:\n";
    for(int i=5;i>=1;i--){
        cout<<i<<" ";
    }

    // 3. Sum from 1 to n
    int n=5, sum=0;
    for(int i=1;i<=n;i++){
        sum+=i;
    }
    cout<<"\n\nSum from 1 to "<<n<<" = "<<sum;

    // 4. Even numbers till 10
    cout<<"\n\nEven numbers:\n";
    for(int i=2;i<=10;i+=2){
        cout<<i<<" ";
    }

    // 5. Multiplication table of 3
    cout<<"\n\nTable of 3:\n";
    for(int i=1;i<=10;i++){
        cout<<"3 x "<<i<<" = "<<3*i<<endl;
    }

    return 0;
}
