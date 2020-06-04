#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,t,i,si;
  cin>>p;
  cin>>i;
  cin>>t;
  si=(p*i*t)/100;
  cout<<si<<"\n";
  int amt = si+p;
  cout<<amt<<"\n";
  float dis;
  dis = .02*si;
  cout<<dis<<"\n";
  float f;
  f=float(amt)-dis;
  cout<<f;
}