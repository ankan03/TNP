// Program to check whether a number is a Harshad number or not. Harshad
// Number is an integer that is divisible by the sum of its digits.
// Input: 1729
// Output: Harshad Number

#include <stdio.h>
void harshadNumber(int n){
	int n1=n,s=0;
	while(n1>=1){
		s = s + n1%10;
		n1 /= 10;
	}
	if (n%s == 0)
		printf("Harshad number\n");
	else
		printf("Not a Harshad number\n");
}
int main(){
	int n;
	printf("Enter no\n");
	scanf("%d",&n);
	harshadNumber(n);
	return 0;
}