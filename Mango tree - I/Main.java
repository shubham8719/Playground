#include <iostream>
#include<iomanip>

using namespace std;

int main()
{


 int r,c,n,c2,c3,c4,c5,r2;
cin>>r>>c>>n;
// 
c2=c*2;

c3=c*3;
// 
c4=c*4;

c5=c*5;
// 
r2=r*2;
// 
if(n>1&&n<=c)
// 
cout<<"Yes";
//   
else if(n==c||n==c2||n==c3||n==c4||n==c5)
// 
cout<<"Yes";
// 

// 
else if(n==(c+1) || n==(c2+1) || n==(c3+1) || n==(c4+1) || n==(c5+1))
    cout<<"Yes";


else
// 
cout<<"No";

}