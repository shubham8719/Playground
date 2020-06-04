#include<iostream>
using namespace std;
int main()
{
  int items;
  float time;
  std::cin>>items>>time;
 if (items==2)
   std::cout<<time+(time/2);
  else if (items==3)
    std::cout<<time*2;
  else
    std::cout<<"Number of items is more";
   
}