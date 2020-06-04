
#include<iostream>
using namespace std;
int swap(int &a,int &b)
{
int temp;
  temp=a;
  a=b;
  b=temp;
}

int main()
{
int num1,num2;
  cin>>num1>>num2;
  cout<<"Before swapping a= "<<num1 <<" and b="<<num2<<"\n";
  swap(num1,num2);
  cout<<"After swapping a= "<<num1 <<" and b="<<num2;
}