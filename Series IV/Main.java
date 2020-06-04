#include<iostream>
using namespace std;
int main()
{
  int n,term,i;
  cin>>n;
  for(i=1;i<=n;i++)
  {           
  if(i%2==1)
  {
  term=(i*i)-1;}
    
  else{
  term=(i*i)-2;}
  cout<<term<<" ";
             }
                }