// In a mathematics class, Jason the mathematics teacher asked to solve a book of expressions consisting of characters, operators, and brackets. 
// But Jason wants to give simplified expressions by removing brackets from the expressions. 
// Write an algorithm to help Jason simplify an expression by removing brackets 

// Input: x-(p+q)+(y-a) 
// Output: x-p+q+y-a

#include <stdio.h>

void removingBracket(char *str){
	printf("\nBEFORE\n");
	for (int i = 0; str[i]!='\0'; ++i)
	{
		printf("%c\t",str[i] );
	}

	printf("\n");

	char temp[100] = {'\0'};
	int j=0;

	for (int i = 0; str[i] != '\0'; ++i)
	{
		if (str[i]!=41 && str[i]!=40)
		{
			temp[j]=str[i];
			j++;
		}
	}

	printf("\nAFTER\n");
	for (int i = 0; temp[i]!='\0'; ++i)
	{
		printf("%c\t",temp[i] );
	}	
}
int main(){
	char *str = "x-(p+q)+(y-a)";
	removingBracket(str);
	return 0;
}