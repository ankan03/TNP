// N=4 
// 1 
// 2*3 
// 4*5*6 
// 7*8*9*10 
// 7*8*9*10 
// 4*5*6 
// 2*3 
// 1

#include <stdio.h>
void main(){
	int c=0,n;
	printf("Enter N\n");
	scanf("%d",&n);


	for (int i = 1; i <= n; ++i)
	{
		for (int j = 1; j <= i; ++j)
			{
				if (j==1)
				{
					printf("%d",++c);
				}else{
					printf("*%d",++c);
				}
			}
			printf("\n");	
	}
	int t;
	for (int i = n; i >=1; --i)
		{
			int l=0;
			t=c-i+1;
			for (int j = t; j <= c; ++j)
			{
				if (l==0)
				{
					printf("%d",t++);
					l=1;
				}else{
					printf("*%d",t++);
				}
			}
			// printf("t=%d\n",t);
			// printf("c=%d\n",c);
			c=c-i;
			printf("\n");
		}	
}