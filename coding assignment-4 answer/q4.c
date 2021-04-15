// Program to print the sum of elements in the Zigzag sequence in a given matrix.
// Input: Matrix[3][3] 1 2 3
// 					   4 5 6
// 					   7 8 9
// Output: 1+2+3+5+7+8+9 = 35


#include <stdio.h>
void zMatrixSum(int m[3][3],int row_size,int column_size){
	int s=0,lc=column_size-2,fr=0,i=0;

	printf("Matrix:\n");
	while(fr<row_size && lc>=0 ){
		if (fr==0||fr==row_size-1)
		{
			for (i = 0; i < column_size; ++i)
			{
				printf("%d\t",m[fr][i]);
				s+= m[fr][i];
			}
			fr++;
		}else{
			for (i = 0; i < column_size; ++i)
			{
				if (i==lc)
				{
					printf("%d\t",m[fr][lc]);
					s+= m[fr][lc];
					fr++;
					lc--;
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

	zMatrixSum(m,row_size,column_size);
	return 0;
}