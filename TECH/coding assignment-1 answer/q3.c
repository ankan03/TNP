// Program to print nth prime number.
// Input: n=5
// Output: 11

#include <stdio.h>
#include <stdlib.h>
int prime(int n){
	int a[n];
	int n1=0,j=1,k=0;
	while(n1<=n){
		int c=0;
		for (int i = 2; i <j ; ++i)
		{
			if (j%i == 0)
			{
				c++;
			}

		}
		if (c==0)
		{
			a[k]=j;
			k++;
			n1++;
		}
		j++;
	}
	return a[n1-1];
}
void main(){
	int n;
	printf("Enter value of n\n");
	scanf("%d",&n);
	int ans = prime(n);
	printf("%d th prime number is = %d\n",n,ans);

}