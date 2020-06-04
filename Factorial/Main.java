#include<iostream>
using namespace std;
int main()
{
  int num,fact=1,i;
  cin>>num;
  for(i=num;i>0;i--)
  {fact=fact*i;}
  cout<<"The factorial of "<<num<<" is "<<fact;
}