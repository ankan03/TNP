// Program to print first n non-fobo numbers. First n numbers not in Fibonacci
// series. 0 1 1 2 3 5 8 13……
// Input: n=5
// Output: 4 6 7 9 10

#include <stdio.h>
#include <stdlib.h>

void fib(int n){
	int x=0,y=1,z=x+y,k=0;
	int a[n+5],b[n];
	a[0]=0;a[1]=1;
	int n1=2;
	while(k<=n){
		z=x+y;
		x=y;
		y=z;
		a[n1]=z;
		
		if (a[n1]-a[n1-1]>1)
		{
			// printf("a[n1] = %d , a[n1-1] = %d\n",a[n1],a[n1-1]);
			int p = a[n1-1]+1;
			
			while(p < a[n1]){
				b[k]=p;
				k++;p++;
			}
		}
		n1++;
	}
	for (int i = 0; i < n; ++i)
	{
		printf("%d\t",b[i] );
	}
	// return b[n-1];
}
void main(){
	int n;
	printf("Enter value of n\n");
	scanf("%d",&n);
	fib(n);
	// printf("%d th Non-Fibonacci number is = %d\n",n,ans);
}