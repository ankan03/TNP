#include <stdio.h>

void main(){
	int n,s;
	printf("Enter value of N and S\n");
	scanf("%d%d",&n,&s);

	for (int i = 1; i <= n; ++i)
	{
		int j;
		for (j = 1; j <= i; ++j)
		{
			printf("%d",s);
		}
		// if (j<=i)
		// {
			s++;
			printf("\n");
		// }
		
	}
	s--;
	for (int i = n; i >= 0; --i)
	{
		for (int j = 1; j <= i; ++j)
		{
			printf("%d",s);
		}
		s--;
		printf("\n");
	}
	
}