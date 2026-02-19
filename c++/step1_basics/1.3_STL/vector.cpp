#include <iostream>
#include <vector>
using namespace std;

int main() {

    // Vector = dynamic array (can grow/shrink at runtime)

    vector<int> v;          
    // vector<int> v(5);        -> creates [0,0,0,0,0]
    // vector<int> v(5,10);     -> creates [10,10,10,10,10]

    // ---- Adding elements ----
    v.push_back(10);          // add 10 at end
    v.push_back(20);          // add 20 at end
    v.emplace_back(30);       // faster in-place insertion

    cout << "After push/emplace: ";
    for(int x : v) cout << x << " ";
    cout << endl;


    // ---- Accessing elents ----
    cout << "First element (v[0]) = " << v[0] << endl;
    cout << "Third element using at() = " << v.at(2) << endl;

    cout << "Current size = " << v.size() << endl;


    // ---- Removing laselement ----
    v.pop_back();

    cout << "After pop_back: ";
    for(int x : v) cout << x << " ";
    cout << endl;


    // ---- Add again ----
    v.emplace_back(35);

    cout << "Last element = " << v.back() << endl;


    // ---- Clear vector ----
    v.clear();
    cout << "Size after clear = " << v.size() << endl;


    // ---- Insert example ----
    v.push_back(10);                // [10]
    v.insert(v.begin()+1, 100);     // insert 100 at index 1

    cout << "After insert: ";
    for(int x : v) cout << x << " ";
    cout << endl;

    cout << "Element at index 1 = " << v[1] << endl;

    return 0;
}
