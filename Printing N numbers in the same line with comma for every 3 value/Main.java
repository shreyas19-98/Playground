#include <stdio.h>
int main() {
int n;
  scanf("%d",&n);
  int count=0;
  for(int i=1;i<=n;i++)
  {
   if(count!=3)
   {
     printf("%d",i);
     count=count+1;
   }
    if(count==3)
    {
      printf(",");
      count=0;
    }
  }
    
    
}