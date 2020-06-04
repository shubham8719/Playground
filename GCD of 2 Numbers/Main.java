#include<iostream>
using namespace std;
int gcd(int a,int b)
{
  int small,i;
if(a<b)
{small=a;}
  else
{small=b;}
  for(i=small;i>0;i--)
  {
  if(a%i==0 && b%i ==0)
  {return i;}
  }
}
int main()
{
  int num1,num2;
  cin>>num1>>num2;
  cout<<"G.C.D of "<<num1 <<" and "<<num2 <<" = "<<gcd(num1,num2);
}