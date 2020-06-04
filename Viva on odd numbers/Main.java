#include<iostream>
using namespace std;
int main()
{
  int num,count=0;
  float score=0.00;
  do{
  cin>>num;
    if (num<0)
    {score=score-1.00;}
    else if(num%2==1)
    {score++;
    count++;}
    else
    {score=score-.50;}
   
  }while(count!=3 && num>0);
  cout<<score;
   
}