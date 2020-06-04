#include<iostream>
using namespace std;
  int main ()
{
  int i,j,n;
  std::cin>>n;
  for(i=n;i<=(n+3);i++)
  {
    for(j=(n-1);j<=i;j++)
    {
      if(j<i)
        std::cout<<i;
      else
        std::cout<<"\n";
    }
  }
    for(i=(n+3);i>=n;i--)
    {
      for(j=(n-1);j<=i;j++)
      {
        if(j<i)
          std::cout<<i;
        else
          std::cout<<"\n";
      }
    }
}