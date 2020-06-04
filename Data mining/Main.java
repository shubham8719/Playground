#include<iostream>
using namespace std;
int main()
{
int num,esum=0,osum=0,dig;
  cin>>num;
  while(num>0)
  {
  dig=num%10;
  if (dig%2==0)
  {esum=esum+dig;}
  else
  {osum=osum+dig;}
  num=num/10;}
  if(osum==esum)
  {cout<<"Yes";}
  else
  {cout<<"No";}
  
}