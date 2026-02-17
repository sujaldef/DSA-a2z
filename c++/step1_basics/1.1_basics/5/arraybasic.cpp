#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cmath>

using namespace std;

int main() {

    int n;
   cout<<"Enter the size of the array: ";
    cin>>n;
    int arr[100];
    for(int i=0;i<n;i++)
    {
        int x;
        cout<<"enter the elemnt no "<<i+1<<" : "<<endl;
        cin>>x;
        arr[i]=x;
    }
    cout<<"The elements of the array are: "<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<"reverse of the array are: "<<endl;
    for(int i=n-1;i>=0;i--)
    {
        cout<<arr[i]<<" ";
    }
cout<<"sum of the arrau ois "<<endl;
int sum =0,avg=0;
for(int i=0;i<n;i++)
{
    sum+=arr[i];
}
avg=sum/n;
cout<<"sum is "<<sum<<endl;
cout<<"average is "<<avg<<endl;

cout<<"maximum element in the array is "<<endl;
int max=arr[0];
for(int i=1;i<n;i++)
{
    if(arr[i]>max)
    {
        max=arr[i];
    }
}
cout<<max<<endl;
    return 0;
}