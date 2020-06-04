
#include <iostream>
using namespace std;
int expo(int,int,int);
int main()
{int a,b,c;
 cin>>a>>b>>c;
if(expo(a,b,c))
  cout<<"Doctor, you can proceed with your experiment.";
else
  cout<<"Sorry Doctor! You need more bacteria.";
}
int expo(int x,int y,int z)
{int i,tot=1;
for(i=1;i<=y;i++)
{
tot=tot*x;}
 if(tot>=z)
   return 1;
 else
   return 0;
}