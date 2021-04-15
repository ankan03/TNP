// N=5 
// 1 
// 3*2 
// 4*5*6 
// 10*9*8*7 
// 11*12*13*14*15

#include <stdio.h>
void main(){
	int c=0,n;
	printf("Enter N\n");
	scanf("%d",&n);


	for (int i = 1; i <= n; ++i)
	{
		if (i%2 != 0)
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
		}else if(i%2 == 0){
			int t = c+i;
			int l=0;
			for (int j = t; j > c; --j)
			{
				if (l==0)
				{
					printf("%d",t--);
					l=1;
				}else{
					printf("*%d",t--);
				}
			}
			printf("\n");
			c = c+i;
		}	
	}	
}