#include<iostream>
int main()
{
  char a;
  int x;
  float y;
  double z;
  std::cin>>a>>x>>y>>z;
  std::cout<<""<<sizeof(a);
  std::cout<<"\n"<<sizeof(x);
  std::cout<<"\n"<<sizeof(y);
  std::cout<<"\n"<<sizeof(z);
}