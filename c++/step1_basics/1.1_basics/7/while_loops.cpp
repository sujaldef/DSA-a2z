#include <iostream>
using namespace std;

int main(){

    // // 1. Count 1 to 5
    // cout<<"Count up:\n";
    // int i=1;
    // while(i<=5){
    //     cout<<i<<" ";
    //     i++;
    // }

    // // 2. Count backwards
    // cout<<"\n\nCount down:\n";
    // i=5;
    // while(i>=1){
    //     cout<<i<<" ";
    //     i--;
    // }

    // // 3. Sum from 1 to n
    // int n=5, sum=0;
    // i=1;
    // while(i<=n){
    //     sum+=i;
    //     i++;
    // }
    // cout<<"\n\nSum = "<<sum;

    // // 4. User input loop example
    // cout<<"\n\nEnter numbers (0 to stop):\n";
    // int x;
    // while(true){
    //     cin>>x;
    //     if(x==0) break;
    //     cout<<"You entered "<<x<<endl;
    // }
    
    cout<<"loop will continue until user enters 0\n";
  int sum=0;
  int x;
  while(true){
    cin>>x;
    if(x==0) break;
    sum+=x;
  }
  cout<<"Sum of entered numbers is "<<sum<<endl;
    return 0;
}
