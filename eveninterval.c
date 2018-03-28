#include<stdio.h>
int main()
{ 
    int i ,n,m;
    scanf("%d %d",&n,&m);
    printf("Enter the even numbers:");
   for(i=n;i<m;i++)
   {
       if(i%2==0)
       printf("%d",i);
       printf("\n");
   }
   return 0;
}
