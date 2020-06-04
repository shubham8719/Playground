#include<iostream>
using namespace std;
int main()
{
int fscore,sum=0,turns=0,pscore;
  cin>>fscore;
  do{
    cin>>pscore;
    sum=sum+pscore;
    turns++;}
  while(sum<fscore);
  cout<<"The number of turns is "<<turns;
     }