#include<iostream>
using namespace std;
int main()
{
  int x,y,i,sum=0;
  std::cin>>x>>y;
  for (i=1;i<(x+y);i++)
  {
    if((x+y)%i==0)
      sum=sum+i;
  }
  if((x+y)==sum)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
  
}