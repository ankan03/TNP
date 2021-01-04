#include <stdio.h>
void main(){
	int n;
	printf("Enter N\n");
	scanf("%d",&n);
	int a[n] , b[n];
	printf("Enter elements\n");
	for (int i = 0; i < n; ++i)
	{
		scanf("%d",&a[i]);
	}

	for (int i = 0; i < n; ++i)
	{
		b[i] = a[i];
	}

	for (int i = 0; i < n; ++i)
	{
		for (int j = i+1; j < n; ++j)
		{
			if (b[i]>=b[j])
			{
				int t = b[i];
				b[i] = b[j];
				b[j] = t;
			}
		}
	}

	//c[] array is for sorted unique array made from main array a[]/b[]
	//d[] array is to count the repeation of each element in c[]
	int c1=1,k=0,c[n],d[n];
	for (int i = 0; i < n; ++i)
	{
		if (b[i] != b[i+1])
		{
			c[k] = b[i];
			d[k] = c1;
			k++;c1=1;
		}else{
			c1++;
		}
	}

	printf("k = %d\n",k );
	printf("c[]  ");
	for (int i = 0; i < k; ++i)
	{
		printf("%d  ",c[i] );
	}
	printf("\n");
	printf("d[]  ");
	for (int i = 0; i < k; ++i)
	{
		printf("%d  ",d[i] );
	}
	printf("\n");


	//for digits array e[] according to the ORDER they came in the array
	int e[k];
	int h[k];
	for (int i = 0; i < k; ++i)
	{
		if (i==0)
		{
			h[i]=0;
		}else{
			h[i]=1;
		}
	}


	int c2=0,l=0,c3=0;
	e[0] = a[0];
	for (int i = 0; i < n; ++i)
	{
		c2=0;
		for (int j = 0; j <= l; ++j)
		{
			// printf("a[%d] = %d  e[%d] = %d  l = %d",i,a[i],j,e[j],l );
			// printf("\n");
			if (a[i] == e[j])
			{
				// printf("Inside if\n");
				h[j] = h[j] +1;
				c2 = 1;
			}
		}
		if (c2==0)
		{
			l++;
			e[l] = a[i];
			
		}
	}



	//for sorted frequency array x[]
	int x[k];
	for (int i = 0; i < k; ++i)
	{
		x[i] = h[i];
	}


	//for digits array y[] according to the sorted frequency array x[]
	int y[k];
	for (int i = 0; i < k; ++i)
	{
		y[i] = e[i];
	}

	for (int i = 0; i < k; ++i)
	{
		for (int j = i+1; j < k; ++j)
		{
			if (x[i]<x[j])
			{
				int t = x[i];
				int t1 = y[i];

				x[i] = x[j];
				y[i] = y[j];

				x[j] = t;
				y[j] = t1;
			}
		}
	}

	printf("l = %d\n",l);
	printf("e[]  ");
	for (int i = 0; i <= l; ++i)
	{
		printf("%d  ",e[i] );
	}
	printf("\n");

	printf("h[]  ");
	for (int i = 0; i < k; ++i)
	{
		printf("%d  ",h[i] );
	}
	printf("\n");


	printf("-------------------\n");

	printf("Final sorted array according to the frequency is ----------\n");
	for (int i = 0; i < k; ++i)
	{
		for (int j = 0; j < x[i]; ++j)
		{
			printf("%d  ",y[i]);
		}
	}


// 	//for sorted frequency array f[]
// 	int f[k];
// 	for (int i = 0; i < k; ++i)
// 	{
// 		f[i] = d[i];
// 	}


// 	//for digits array g[] according to the sorted frequency array f[]
// 	int g[k];
// 	for (int i = 0; i < k; ++i)
// 	{
// 		g[i] = c[i];
// 	}

// 	for (int i = 0; i < k; ++i)
// 	{
// 		for (int j = i+1; j < k; ++j)
// 		{
// 			if (f[i]<f[j])
// 			{
// 				int t = f[i];
// 				int t1 = g[i];

// 				f[i] = f[j];
// 				g[i] = g[j];

// 				f[j] = t;
// 				g[j] = t1;
// 			}
// 		}
// 	}

// 	//for sorted frequency array f[]
// 	printf("f[] ");
// 	for (int i = 0; i < k; ++i)
// 	{
// 		printf("%d  ",f[i] );
// 	}

// 	//for digits array g[] according to the sorted frequency array f[]
// 	printf("\ng[] ");

// 	for (int i = 0; i < k; ++i)
// 	{
// 		printf("%d  ",g[i] );
// 	}
// 	printf("\n");


// printf("Final sorted array according to the frequency is ----------\n");
// 	for (int i = 0; i < k; ++i)
// 	{
// 		for (int j = 0; j < f[i]; ++j)
// 		{
// 			printf("%d  ",g[i]);
// 		}
// 	}
}