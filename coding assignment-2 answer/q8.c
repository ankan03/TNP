// 1*2*3*4*17*18*19*20 
//   5*6*7*14*15*16 
//     8*9*12*13 
//       10*11


#include <stdio.h>
void main(){
	int c=0,n,d;

	printf("Enter N\n");
	scanf("%d",&n);
	d=n*n+1;

	for (int i = 0; i < n; ++i)
	{
		if (i>0)
		{
			for (int j = 0; j < i; ++j)
			{
				printf("  ");
			}
		}

		for (int j = 0; j < n-i; ++j)
		{
			if (j==0)
			{
				printf("%d",++c);
			}else{
				printf("*%d",++c);
			}
		}
		int t=d+n-i;
		// printf("\td=%d\tt=%d\t",d,t);
		for (int j = d; j < t; ++j)
		{
			printf("*%d",j);
		}
		d=d-(n-i)+1;
		// printf("\td1=%d\tt1=%d\t",d,t);
		printf("\n");
		
	}

}