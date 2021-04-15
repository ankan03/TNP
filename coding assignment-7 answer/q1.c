// Program to check for balanced parenthesis in an expression

// Input: ((())) 
// Output: 1 

// Input: ()(( 
// Output: -1

#include <stdio.h>
int isBalance(char *str){
	int c=0;

	for (int i = 0; str[i]!='\0'; ++i)
	{
		if (c<0)
		{
			return -1;
		}else{
			if (str[i] == 40){
				c++;
			}else if (str[i] == 41){
				c--;
			}
		}
	}

	if (c==0){
		return 1;
	}else{
		return -1;
	}
}

int main(){
	char *str = "(()())";
	printf("isBalance = %d\n",isBalance(str));
	return 0;
}