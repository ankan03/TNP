// Program to find the GCD of n numbers.
// Input: n=6
// 5 10 25 45 95 65
// Output: 5

#include <stdio.h>
#include <stdlib.h>
int* sort(int a[],int n){
	for (int i = 0; i < n; ++i)
	{
		for (int j = i+1; j <n ; ++j)
		{
			if (a[i] >= a[j])
			{
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
	}
	return a;
}
int gcd(int a[], int n){
	int c=2,c1=0,b=1;

	int *d = (int*)malloc(n*sizeof(int));
	d= sort(a,n);
	do{
		for (int i = 0; i < n; ++i)
		{
			if (*(d+i)%c == 0)
			{
				c1++;
			}
		}
		if (c1 == n){
			b=c;c++;c1=0;
		}else{
			c++;c1=0;
		}

}while(c<=*(d+0));

return b;

}
int main(){
	int n;
	printf("Enter no of items\n");
	scanf("%d",&n);
	int a[n];
	printf("Enter the no\n");
	for (int i = 0; i < n; ++i)
	{
		scanf("%d",&a[i]);
	}
	int ans = gcd(a,n);

	printf("GCD = %d\n",ans );
}