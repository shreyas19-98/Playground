#include<stdio.h>
int help(int n)
{
  if(n==0 || n==1)
  {
    return 1;
  }
  else
  {
    return n*help(n-1);
  }
}
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  int ans=help(n);
  printf("%d",ans);
	return 0;
}