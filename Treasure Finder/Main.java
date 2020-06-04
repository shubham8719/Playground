
#include<iostream>
using namespace std;
int main()
{
  int x,y,z,p,i,hcf;
 std::cin>>x>>y>>z;
  if(x>y&&x>z)
  {
    if(y>z)
      std::cout<<"The treasure is in box which has number "<<y<<"\n";
    else
      std::cout<<"The treasure is in box which has number "<<z<<"\n";
  }
  else if(y>x&&y>z)
  {
    if(x>z)
       std::cout<<"The treasure is in box which has number "<<x<<"\n"; 
    else
       std::cout<<"The treasure is in box which has number "<<z<<"\n";
  }
  else if(z>x&&z>y)
  {
    if(x>y)
       std::cout<<"The treasure is in box which has number "<<x<<"\n";
    else
       std::cout<<"The treasure is in box which has number "<<y<<"\n";
  }
  p=x*y*z;
  for (i=p;i<=p;i--)
  {
    if(x%i==0 && y%i==0 && z%i==0)
    {
      hcf=i;
      break;
    }
  }
  std::cout<<"The code to open the box is "<<hcf;
}