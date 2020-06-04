#include<iostream>
int main()
{
  int x,y;
  std::cin>>x>>y;
  y=x%2;
  (y==0)?std::cout<<"Even":std::cout<<"Odd";
}