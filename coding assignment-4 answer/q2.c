// Program to find the saddle point coordinates in a given matrix. A saddle point is an element of the matrix, which is the minimum element in its row and the maximum in its column.
// Input: Matrix[3][3] - 1 2 3
// 					  	 4 5 6
// 					  	 7 8 9
// Output: 7

#include <stdio.h>
void saddlePoint(int m[5][5],int row_size,int column_size){
	// printf("Inside spiral *****\n");
	// for (int i = 0; i < row_size; ++i)
	// {
	// 	for (int j = 0; j < column_size; ++j)
	// 	{
	// 		printf("%d\t",m[i][j]);
	// 	}
	// 	printf("\n");
	// }
	int a[row_size*column_size],c=0;
int k=0;
while(k<row_size){
	int min=m[k][0],index=0;
	for (int j = 0; j < column_size; ++j)
	{
		// printf("\nk = %d ,j = %d ,m[k][j] = %d\n",k,j,m[k][j] );
		if (m[k][j]<min)
		{
			min = m[k][j];
			index = j;
		}
	}
	// printf("\nmin =  %d index = %d",min,index);

	int max=m[k][index];

	for (int l = 0; l < row_size; ++l)
	{
		// printf("\nl = %d ,index = %d ,m[l][index] = %d\n",l,index,m[l][index] );
		if (m[l][index]>max)
		{
			max=m[l][index];
		}
	}

	// printf("\nmax =  %d ",max);

	if (max == min)
	{
		// printf("%d\t",min);
		a[c] = min;
		c++;
	}
	// else{
	// 	printf("\nNo saddle point found\n");
	// }

	k++;
}
	if (c>0)
	{
		printf("Saddle point: \t");
		for (int i = 0; i < c; ++i)
		{
			printf("%d\t",a[i] );
		}
	}else{
		printf("No Saddle point found\n");
	}

	

}
int main(){
	int row_size = 5;
	int column_size = 5;

	// int m[8][6] = {{1,2,3,4,11,99},{5,6,7,8,22,88},{9,10,11,12,33,77},{13,14,15,16,44,66},{17,18,19,20,55,55},{21,22,23,24,66,44},{1,2,3,4,5,6},{6,5,4,3,2,1}};
	// int m[3][3] = {{1,1,3},{4,3,6},{7,2,9}};
	int m[5][5] = {
		{10,12,7,3,12},
		{3,10,6,2,8},
		{18,24,17,6,10},
		{15,21,10,8,12},
		{1,18,22,4,15}
	};

	for (int i = 0; i < row_size; ++i)
	{
		for (int j = 0; j < column_size; ++j)
		{
			printf("%d\t",m[i][j]);
		}
		printf("\n\n");
	}

	// printf("Spiral form is ----\n");
	saddlePoint(m,row_size,column_size);
	return 0;
}