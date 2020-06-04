#include<iostream>
int main()
{
  int x,y,z;
  std::cin>>x>>y>>z;
  if(z==(x+y)*2)
  {
    std::cout<<"It is a mango tree";
  }
  else if(z==x+y)
          {
            std::cout<<"It is a mango tree";
          }
          else
          {
            std::cout<<"It is not a mango tree";
          }
}