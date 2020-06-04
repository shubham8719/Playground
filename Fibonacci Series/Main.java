#include<iostream>
using namespace std;
int main()
{
int num,i,a=0,b=1,c;
  cin>>num;
  for(i=2;i<num;i++)
  {c=a+b;
  a=b;
  b=c;}
  cout<<"The term "<<num <<" in the fibonacci series is "<<b;
}