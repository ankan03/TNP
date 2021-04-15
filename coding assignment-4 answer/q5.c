// Given a matrix, the task is to print the boundary elements of the matrix and display their sum.
// Input: Matrix[3][3] 1 2 3
// 					4 5 6
// 					7 8 9
// Output: 1 2 3
// 		4 	6
// 		7 8 9
// Sum = 1+2+3+6+9+8+7+4 = 40

#include <stdio.h>
void boundaryMatrixSum(int m[3][3],int row_size,int column_size){
	int s=0;

	printf("Matrix:\n");
	for (int i = 0; i < row_size; ++i)
	{
		for (int j = 0; j < column_size; ++j)
		{
			if (i==0||i==row_size-1)
			{
				printf("%d\t",m[i][j]);
				s+=m[i][j];
			}else{
				if (j==0||j==column_size-1)
				{
					printf("%d\t",m[i][j]);
					s+=m[i][j];
				}else{
					printf(" \t");
				}
			}
		}
		printf("\n\n");
	}
	printf("Sum = %d\n",s );
}


int main(){
	int row_size = 3;
	int column_size = 3;

	// int m[8][6] = {{1,2,3,4,11,99},{5,6,7,8,22,88},{9,10,11,12,33,77},{13,14,15,16,44,66},{17,18,19,20,55,55},{21,22,23,24,66,44},{1,2,3,4,5,6},{6,5,4,3,2,1}};
	// int m[3][3] = {{1,1,3},{4,3,6},{7,2,9}};
	// int m[6][6] = {
	// 	{10,12,7,3,12,11},
	// 	{3,10,6,2,8,22},
	// 	{18,24,17,6,10,33},
	// 	{15,21,10,8,12,44},
	// 	{1,18,22,4,15,55},
	// 	{66,77,88,99,00,11}
	// };
	int m[3][3] = {{1,2,3},{4,5,6},{7,8,9}};

	for (int i = 0; i < row_size; ++i)
	{
		for (int j = 0; j < column_size; ++j)
		{
			printf("%d\t",m[i][j]);
		}
		printf("\n\n");
	}

	boundaryMatrixSum(m,row_size,column_size);
	return 0;
}