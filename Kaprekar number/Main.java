#include<iostream>
using namespace std;
int main()
{
  int num,a=0,b=0,c=1,sqr,sum;
  cin>>num;
  int temp=num;
  sqr=num*num;
  while(temp>0)
  {
    c=c*10;
    temp=temp/c;
  }
  
  a=sqr%c;
  b=sqr/c;
  sum=a+b;
  if(sum==num)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}