// 11112 
// 32222 
// 33334 
// 54444

#include <stdio.h>

void main(){
	int n,s=1;
	printf("Enter no of line\n");
	scanf("%d",&n);

	for (int i = 1; i <= n; ++i)
	{
		if (i%2 == 1)
		{
			for (int j = 0; j < 4; ++j)
			{
				printf("%d",s);
			}
			printf("%d",s+1);
			printf("\n");
			s++;
		}else{
			printf("%d", s+1);
			for (int j = 0; j < 4; ++j)
			{
				printf("%d",s);
			}
			printf("\n");
			s++;
		}
	}
}