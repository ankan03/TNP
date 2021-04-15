// Program to print the elements of a 2d array in the form of a matrix in spiral form.
// Input: 
// 	1 	2 	3 	4
// 	5 	6 	7 	8
// 	9 	10 	11 	12
// 	13 	14 	15 	16
// Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


#include <stdio.h>
void spiral(int m[3][3],int row_size,int column_size){
	printf("Inside spiral *****\n");
	// for (int i = 0; i < row_size; ++i)
	// {
	// 	for (int j = 0; j < column_size; ++j)
	// 	{
	// 		printf("%d\t",m[i][j]);
	// 	}
	// 	printf("\n");
	// }

	int i = 0 , fr = 0 , fc = 0 , lr = row_size-1 , lc = column_size-1;
	while(fr<=lr && fc<=lc){

	// printf("\nfr = %d\n",fr);
	// printf("fc = %d\n",fc);
	// printf("lr = %d\n",lr);
	// printf("lc = %d\n",lc);
	// printf("\n");

	for (i = fr; i <=lc ; ++i)
	{
		printf("%d\t",m[fr][i]);
	}
	fr++;

	// printf("\nfr = %d\n",fr);
	// printf("fc = %d\n",fc);
	// printf("lr = %d\n",lr);
	// printf("lc = %d\n",lc);
	// printf("\n");

	for (i = fr; i <=lr ; ++i)
	{
		printf("%d\t",m[i][lc]);
	}
	lc--;

	// printf("\nfr = %d\n",fr);
	// printf("fc = %d\n",fc);
	// printf("lr = %d\n",lr);
	// printf("lc = %d\n",lc);
	// printf("\n");

	for (i = lc; i >=fc ; --i)
	{
		printf("%d\t",m[lr][i]);
	}
	lr--;

	// printf("\nfr = %d\n",fr);
	// printf("fc = %d\n",fc);
	// printf("lr = %d\n",lr);
	// printf("lc = %d\n",lc);
	// printf("\n");

	for (i = lr; i >=fr ; --i)
	{
		printf("%d\t",m[i][fr-1]);
	}
	fc++;

	// printf("\nfr = %d\n",fr);
	// printf("fc = %d\n",fc);
	// printf("lr = %d\n",lr);
	// printf("lc = %d\n",lc);
	// printf("\n");

	}
	


}
int main(){
	int row_size = 3;
	int column_size = 3;

	// int m[8][6] = {{1,2,3,4,11,99},{5,6,7,8,22,88},{9,10,11,12,33,77},{13,14,15,16,44,66},{17,18,19,20,55,55},{21,22,23,24,66,44},{1,2,3,4,5,6},{6,5,4,3,2,1}};
	int m[3][3] = {{1,2,3},{4,5,6},{7,8,9}};

	for (int i = 0; i < row_size; ++i)
	{
		for (int j = 0; j < column_size; ++j)
		{
			printf("%d\t",m[i][j]);
		}
		printf("\n\n");
	}

	printf("Spiral form is ----\n");
	spiral(m,row_size,column_size);
	return 0;
}

// #include <stdio.h>
// const int M = 3;
// const int N = 3;
  
// void print(int arr[M][N])
// {
//     int i, j;
//     for (i = 0; i < M; i++)
//       for (j = 0; j < N; j++)
//         printf("%d ", arr[i][j]);
// }
  
// int main()
// {
//     int arr[][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//     print(arr);
//     return 0;
// }