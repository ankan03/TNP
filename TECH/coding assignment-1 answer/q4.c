// Program to find sum of the prime factors of a number.
// Input: n=100
// Output: 2+5=7

#include <stdio.h>
#include <stdlib.h>
int isPrime(int n){
	int c=0;
	for (int i = 2; i <= n/2; ++i)
	{
		if (n%i==0)
		{
			c++;
		}
	}
	if (c==0)
	{
		// printf("n = %d, returned 1\n",n );
		return 1;
	}else{
		// printf("n = %d, returned 0\n",n );
		return 0;
	}
}
int SumPrimeFactor(int n){
	int a[n];
	int c=0,s=0;
	for (int i = 2; i <= n/2; ++i)
	{
		if (n%i == 0)
		{
			if (isPrime(i))
			{
				a[c]=i;
				c++;
			}
		}
	}
	for (int i = 0; i < c; ++i)
	{
		s += a[i];
	}
	return s;
}
void main(){
	int n;
	printf("Enter value of n\n");
	scanf("%d",&n);
	int ans = SumPrimeFactor(n);
	printf("Sum of Prime Factor of %d is = %d\n",n,ans);

}