// Program to rotate a matrix by 90 degrees clockwise.
// Input: Matrix[3][3] 1 2 3
// 					   4 5 6
// 					   7 8 9
// Output: 7 4 1
// 		   8 5 2
// 		   9 6 3


#include <stdio.h>

void rotate90DegreeClockwise(int m[6][6],int row_size,int column_size){
int cs=row_size-1,rs=0 , m1[column_size][row_size];
	while(cs>=0){
		for (int i = 0; i < column_size; ++i)
		{
			m1[i][cs] = m[rs][i];
		}
		cs--;
		rs++;
	}

	printf("After operation ..\n");
	for (int i = 0; i < column_size; ++i)
	{
		for (int j = 0; j < row_size; ++j)
		{
			printf("%d\t",m1[i][j] );
		}
		printf("\n");
	}
}
int main(){
	int row_size = 6;
	int column_size = 6;

	// int m[8][6] = {{1,2,3,4,11,99},{5,6,7,8,22,88},{9,10,11,12,33,77},{13,14,15,16,44,66},{17,18,19,20,55,55},{21,22,23,24,66,44},{1,2,3,4,5,6},{6,5,4,3,2,1}};
	// int m[3][3] = {{1,1,3},{4,3,6},{7,2,9}};
	int m[6][6] = {
		{10,12,7,3,12,11},
		{3,10,6,2,8,22},
		{18,24,17,6,10,33},
		{15,21,10,8,12,44},
		{1,18,22,4,15,55},
		{66,77,88,99,00,11}
	};
	// int m[4][3] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

	for (int i = 0; i < row_size; ++i)
	{
		for (int j = 0; j < column_size; ++j)
		{
			printf("%d\t",m[i][j]);
		}
		printf("\n\n");
	}

	rotate90DegreeClockwise(m,row_size,column_size);
	return 0;
}