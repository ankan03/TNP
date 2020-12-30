//       1
//     1  1
//    1  2  1
//   1  3  3  1
//  1  4  6  4  1
// 1  5  10  10  5  
#include <stdio.h>
#include <math.h> 
void main(){
	int n,c=0;
	printf("Enter N\n");
	scanf("%d",&n);

	int x=pow(11,n);
	int a[n];

	while(x>=1){
		int t=x%10;
		a[c] = t;
		t++;
		x /=10;

	}

	for (int i = 0; i < n; ++i)
	{
		for (int j = 0; j < i; ++j)
		{
			
		}
	}

	int a=pow(n,2);
	printf("%d\n",a );

}