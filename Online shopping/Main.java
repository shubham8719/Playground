#include<iostream>
using namespace std;
int main()
{//flipkart
  int amt,dis,ship,t;
  std::cin>>amt>>dis>>ship;
  t=(amt-((amt*dis)/100))+ship;
  std::cout<<"In Flipkart Rs."<<t<<"\n";
  //snapdeal
   int amt1,dis1,ship1,t1;
  std::cin>>amt1>>dis1>>ship1;
  t1=(amt1-((amt1*dis1)/100))+ship1;
  std::cout<<"In Snapdeal Rs."<<t1<<"\n";
  //amazon
   int amt2,dis2,ship2,t2;
  std::cin>>amt2>>dis2>>ship2;
  t2=(amt2-((amt2*dis2)/100))+ship2;
  std::cout<<"In Amazon Rs."<<t2<<"\n";
  //condition
  if(t<=t1&&t<t2)
    std::cout<<"He will prefer Flipkart";
  else if(t1<=t&&t1<t2)
    std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";  
}