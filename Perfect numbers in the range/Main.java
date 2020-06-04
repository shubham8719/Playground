#include<iostream>
using namespace std;
int main()
{
int start,end,sum,i,j;
  cin>>start>>end;

 for(j=start;j<end;j++)
      {sum=0;
       i=1;
          while(i<j)
          {if(j%i==0)
          sum=sum+i;
         i++;
          }
       if (sum==j)
        cout<<j<<" ";
      }
  cout<<"\n";
 /* int n,i,sum;
  int mn,mx;
cin>>mn>>mx;
  for(n=mn;n<=mx;n++){
    i=1;
    sum = 0;
    while(i<n){
      if(n%i==0)
           sum=sum+i;
          i++;
    }
    if(sum==n)
      cout<<n<<" ";
  }
      cout<<" \n";*/
}