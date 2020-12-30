#include <stdio.h>
void main(){
	int n,i,j;
	printf("Enter no\n");
	scanf("%d",&n);

	for (i = 1; i <= n; ++i)
	{
		if (i>1)
		{
			for (int j = 1; j<i ; ++j)
			{
				printf(" ");
			}
		}

		printf("%d ",i );

		for (int j = i+1; j < n; ++j)
		{
			printf("  ");
		}

		if (i!=n)
		{
			printf(" %d",i );	
		}

		printf("\n");
	}


	for (int i = n-1; i >= 1; --i)
	{
		if (i!=1)
		{
			for (int j = 1; j <i ; ++j)
			{
				printf(" ");
			}			
		}

		printf("%d ",i);

		for (int j = n-i; j >1 ; --j)
		{
			printf("  ");
		}

		printf(" %d",i);

		printf("\n");
	}
}