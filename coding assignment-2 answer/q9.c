// N=3
// 3 3 3 3 3 
// 3 2 2 2 3
// 3 2 1 2 3  
// 3 2 2 2 3 
// 3 3 3 3 3

// 4 4 4 4 4 4
// 4 3 3 3 3 4
// 4 3 2 2 3 4
// 4 3 2 2 3 4
// 4 3 3 3 3 4
// 4 4 4 4 4 4

// 5 5 5 5 5 5 5
// 5 4 4 4 4 4 5
// 5 4 3 3 3 4 5
// 5 4 3 2 3 4 5
// 5 4 3 3 3 4 5
// 5 4 4 4 4 4 5
// 5 5 5 5 5 5 5

// 6 6 6 6 6 6 6 6
// 6 5 5 5 5 5 5 6
// 6 5 4 4 4 4 5 6
// 6 5 4 3 3 4 5 6
// 6 5 4 3 3 4 5 6
// 6 5 4 4 4 4 5 6
// 6 5 5 5 5 5 5 6
// 6 6 6 6 6 6 6 6

// 7 7 7 7 7 7 7 7 7
// 7 6 6 6 6 6 6 6 7
// 7 6 5 5 5 5 5 6 7
// 7 6 5 4 4 4 5 6 7
// 7 6 5 4 3 4 5 6 7
// 7 6 5 4 4 4 5 6 7
// 7 6 5 5 5 5 5 6 7
// 7 6 6 6 6 6 6 6 7
// 7 7 7 7 7 7 7 7 7

// 9 9 9 9 9 9 9 9 9 9 9
// 9 8 8 8 8 8 8 8 8 8 9
// 9 8 7 7 7 7 7 7 7 8 9
// 9 8 7 6 6 6 6 6 7 8 9
// 9 8 7 6 5 5 5 6 7 8 9
// 9 8 7 6 5 4 5 6 7 8 9
// 9 8 7 6 5 5 5 6 7 8 9
// 9 8 7 6 6 6 6 6 7 8 9
// 9 8 7 7 7 7 7 7 7 8 9
// 9 8 8 8 8 8 8 8 8 8 9
// 9 9 9 9 9 9 9 9 9 9 9

#include <stdio.h>
void main(){
		int n;
		printf("Enter N\n");
		scanf("%d",&n);
	
	// For N=odd
		if (n%2 != 0)
		{

			// For upper segment
		int x=n/2+2,p=n-1,m=n;

		for (int i = 1; i <= x; ++i)
		{
			m=n;
			if (i==1)
			{
				for (int j = 0; j < n+2; ++j)
				{
					printf("%d ",n);
				}
				printf("\n");
			}else{
				for (int j = 1; j <= i; ++j)
				{
					printf("%d ",m--);
				}

				m++;

				for (int j = 1; j <=p; ++j)
				{
					printf("%d ",m);
				}

				int y=n+2-i;

				for (int j = y+1; j < n+2; ++j)
				{
					printf("%d ",++m);
				}

				p = p-2;
				printf("\n");
			}
		
		}

	// For lower segment
		m=n;
		p=p+2;
		for (int i = n+2-x; i >= 1; --i)
		{
			if (i==1)
			{
				for (int j = 1; j <= n+2; ++j)
				{
					printf("%d ",n);
				}
				printf("\n");
			}else{

				for (int j = i; j >= 1; --j)
				{
					printf("%d ",m--);
				}
				m++;
				p=p+2;

				for (int j = 1; j <= p; ++j)
				{
					printf("%d ",m);
				}

				int z=n+2-i-p;
				for (int j = 1; j <= z; ++j)
				{
					printf("%d ",++m );
				}

				printf("\n");
			}
		}	
	
	}

		// For N=even
	else{

		int x=n/2+1,p=n-1,m=n;

		// For upper segment
		for (int i = 1; i <= x; ++i)
		{
			m=n;
			if (i==1)
			{
				for (int j = 0; j < n+2; ++j)
				{
					printf("%d ",n);
				}
				printf("\n");
			}else{
				for (int j = 1; j <= i; ++j)
				{
					printf("%d ",m--);
				}

				m++;

				for (int j = 1; j <=p; ++j)
				{
					printf("%d ",m);
				}

				int y=n+2-i-p;

				for (int j = y; j >= 1; --j)
				{
					printf("%d ",++m);
				}

				p = p-2;
				printf("\n");
			}
		
		}
		// For lower segment
		m=n;
		p=p;
		for (int i = n+2-x; i >= 1; --i)
		{
			if (i==1)
			{
				for (int j = 1; j <= n+2; ++j)
				{
					printf("%d ",n);
				}
				printf("\n");
			}else{

				for (int j = i; j >= 1; --j)
				{
					printf("%d ",m--);
				}

				m++;
				p=p+2;

				for (int j = 1; j <= p; ++j)
				{
					printf("%d ",m);
				}

				int z=n+2-i-p;
				for (int j = 1; j <= z; ++j)
				{
					printf("%d ",++m );
				}

				printf("\n");
			}
		}	

	}

}