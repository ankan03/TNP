// Program to convert a number from decimal to binary
// Input: 5
// Output: 0101

#include <stdio.h>
#include <math.h>
int main(){
	int n,j=0;
	printf("Enter no\n");
	scanf("%d",&n);
	printf("Binary value of %d = ",n );
	int a[(int)log2(n) +1];
	while(n>0){
		a[j] = n % 2;
		j++;
		n /= 2;
	}
	
	for (int i = j-1; i >=0; i--)
	{
		printf("%d", a[i]);
	}
}