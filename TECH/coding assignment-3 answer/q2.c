#include <stdio.h>
void main(){
	int n;
	printf("Enter size of array\n");
	scanf("%d",&n);
	int a[n],b[n];
	printf("Enter elements\n");
	for (int i = 0; i < n; ++i)
	{
		scanf("%d",&a[i]);
	}

	for (int i = 0; i < n; ++i)
	{
		b[i] = a[i];
	}

	for (int i = 0; i < n; ++i)
	{
		int c=0;
		for (int j = 0; j < n ; ++j)
		{
			if (j!=i)
			{
				if (a[i] == b[j])
				{
					c=1;
				}
			}
		}
		if (c==0)
		{
			printf("%d\t",a[i]);
		}
	}
}