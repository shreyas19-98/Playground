#include <stdio.h>
int help(int n)
{
  if(n==0)
  {
    return 0;
  }
  return n+help(n-1);
}
int main(int argc, char *argv[])
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int ans=help(n);
  printf("%d",ans);
  return 0;
}