#include<iostream>
using namespace std;
int main()
{
int r,x,a,b,d;
  std::cin>>r>>x;
  a=x*x;
  b=(22/7)*r*r;
  d=2*r;
  if(d==x)
  {
    std::cout<<"circle can be inside a square";
}
  else
  {
    std::cout<<"circle cannot be inside a square";
  }
}