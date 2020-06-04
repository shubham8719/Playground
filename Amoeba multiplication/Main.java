#include<iostream>
using namespace std;
int main()
{
 int month,fib,a,b,c,i;
  a=0;
  b=1;
  cin>>month;
  if(month==0)
    cout<<0;
  else if(month==1)
    cout<<1;
  else
  {
  for(i=2;i<month;i++)
  {
    c=a+b;
    a=b;
    b=c;
    }
    cout<<b;}
}