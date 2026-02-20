#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cmath>

using namespace std;

int main() {

    pair<int,char> pa ={12,'a'};
    cout<<pa.first<<" "<<pa.second<<endl;

    // also we c
    pair <int,pair<int,char>> p2 = {1,{2,'b'}};
    cout<<p2.first<<" "<<p2.second.first<<" "<<p2.second.second<<endl;
    // also an array
    pair<int,char> arr[3]= {{1,'a'},{2,'b'},{3,'c'}};
    for(int i=0;i<3;i++)
    {
        cout<<arr[i].first<<" "<<arr[i].second<<endl;
    }
    return 0;
}