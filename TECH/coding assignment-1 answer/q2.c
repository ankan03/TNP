// Program to print nth Fibonacci number. 0 1 1 2 3 5 8 13 21…….
// Input: n=7
// Output: 8

#include <stdio.h>
#include <stdlib.h>
int fib(int n){
	int x=0,y=1,z=x+y;
	int a[n];
	a[0]=0;a[1]=1;
	int n1=2;
	while(n1<=n){
		z=x+y;
		x=y;
		y=z;
		a[n1]=z;
		n1++;
	}
	return a[n-1];
}
void main(){
	int n;
	printf("Enter value of n\n");
	scanf("%d",&n);
	int ans = fib(n);
	printf("%d th Fibonacci number is = %d\n",n,ans);

}