#include <stdio.h>
void print(int c,int n){
	for (int i = c; i < c+n; ++i)
	{
		if (i==c)
		{
			printf("%d",i);
		}else{
			printf("*%d",i);
		}
		
	}
	printf("\n");
}
void main(){
	printf("Enter N\n");
	int n;
	scanf("%d",&n);

	if (n%2==0)
	{
		int x = n/2+1,c=1;
		for (int i = 1; i <= n; ++i)
		{
			if (i<x)
			{
				print(c,n);
				c=c+(2*n);
			}
			else if (i==x)
			{
				c=c-(2*n)+n;
				print(c,n);
			}
			else if (i>x)
			{
				c=c-(2*n);
				print(c,n);
			}
		}
	}else{
		int x = n/2+2,c=1;
		for (int i = 1; i <= n; ++i)
		{
			if (i<x)
			{
				print(c,n);
				c=c+(2*n);
			}
			else if (i==x)
			{
				c=c-(2*n)-n;
				print(c,n);
			}
			else if (i>x)
			{
				c=c-(2*n);
				print(c,n);
			}
		}
	}
}