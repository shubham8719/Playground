#include<iostream>
using namespace std;
int main()
{
int num,ite=0,i;
  cin>>num;
  if (num==1)
  {ite=0;
    cout<<num<<"\n"<<ite;}
  else
  { cout<<num<<"\n";
    while(num>1)
    {
    if(num%2==0)
    {num=num/2;}
      else
      {num=num*3+1;}
      cout<<num<<"\n";
      ite++;
       }
   cout<<ite;
  }
  
    
}