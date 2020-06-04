#include<iostream>
int main()
{
  int x,y;
    std::cin>>x>>y;
  y=x*0.5;
 if(x<=200)
  {
   std::cout<<"Rs."<<y;
  }
  else if(x<=400)
  {
    std::cout<<"Rs."<<(x*0.65)+100;
  }
  else if(x<=600)
  {
    std::cout<<"RS."<<(x*0.80)+200;
  }
  else 
  {
    std::cout<<"Rs."<<(x*1.25)+425;
  }
}