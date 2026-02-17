#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cmath>

using namespace std;

int main() {

    string str;
    cout<<"Enter a string: ";
 getline(cin,str);
 cout<<"The string you entered is: "<<str<<endl;
 cout<<"the sixe of the string is: "<<str.size()<<endl;
 cout<<"The length of the string is: "<<str.length()<<endl;
 cout<<"thes first cahr is "<<str[0]<<endl;
 cout<<"the last char is "<<str[str.length()-1]<<endl;
 cout<<"the string in uppercase is "<<endl;
    for(int i=0;i<str.length();i++)
    {
        cout<<(char)toupper(str[i]);
    }
    cout<<"the string in lowercase is "<<endl;
    for(int i=0;i<str.length();i++)
     cout<<(char)tolower(str[i]);
    cout<<"the reverse of the string is "<<endl;
    for(int i=str.length()-1;i>=0;i--)
    {
        cout<<str[i];
    }
    cout<<endl;
int vowels=0,consonants=0;
for(int i=0;i<str.length();i++)
if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
    vowels++;
else if((str[i]>='a'&&str[i]<='z')||(str[i]>='A'&&str[i]<='Z'))
    consonants++;
cout<<"Number of vowels: "<<vowels<<endl;
cout<<"Number of consonants: "<<consonants<<endl;
return 0 ;
}