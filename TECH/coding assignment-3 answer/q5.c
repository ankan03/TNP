#include <stdio.h>
void main(){
	printf("Enter N\n");	
	int n,s;
	scanf("%d",&n);
	int a[n],b[n];
	printf("Enter the elements\n");
	for (int i = 0; i < n; ++i)
	{
		scanf("%d",&a[i]);
	}
	printf("Enter the given sum\n");
	scanf("%d",&s);

	for (int i = 0; i < n; ++i)
	{
		b[i] = a[i];
	}

	for (int i = 0; i < n; ++i)
	{
		for (int j = i+1; j < n; ++j)
		{
			if (b[i]>b[j])
			{
				int t= b[i];
				b[i] = b[j];
				b[j] = t;
			}
		}
	}

	for (int i = 0; i < n; ++i)
	{
		printf("%d ",b[i] );
	}
	printf("\n");

	int c=0;
	for (int i = 0; i < n; ++i)
	{
		c=0;
		int x=b[i];
		int y=0;
		int z=n-1;
		// printf("???[%d , %d , %d]\n",x,b[y],b[z]);
		while(y<z && c==0){
			// printf("...[%d , %d , %d]\n",x,b[y],b[z]);
			if (x+b[y]+b[z] == s)
			{
				printf("[%d , %d , %d]\n",x,b[y],b[z]);
				// y++;
				c=1;
			}else if (x+b[y]+b[z] > s){
				z--;
			}else if (x+b[y]+b[z] < s){
				y++;
			}
		}
		
	}


}