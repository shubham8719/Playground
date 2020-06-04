#include<iostream>
using namespace std;
int main()
{
 int a[10],n,i,item;
  cin>>n;
  for(i=0;i<n;i++)
  {cin>>a[i];}
  cin>>item;
  int found =0;
  for(i=0;i<n;i++)
  {
  if (item==a[i])
  {found=1;
        break;}
       }
  if (found==1)
  {cout<<"She passed her exam";}
  else
    cout<<"She failed";
}