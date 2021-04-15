// Program to find the frequency of characters in a string in O(n) time complexity. 
// Input: kiit Output: k – 1 i – 2 t – 1

#include <stdio.h>
#include <stdarg.h>

void charSequence(char *str){
	int a[26] = {0};
	int A[26] = {0};
	char c[26] = {'\0'};
	char C[26] = {'\0'};

	for (int i = 0; str[i] != '\0'; ++i)
	{
		if (str[i]>=97)
		{
			a[str[i]-'a']++;
			c[str[i]-'a'] = str[i];
		}else{
			A[str[i]-'A']++;
			C[str[i]-'A'] = str[i];
		}
		
	}

	for (int i = 0; i < 26; ++i)
	{
		if (a[i]!=0)
		{
			printf("%c => %d\n",c[i] ,a[i] );
		}

		if (A[i]!=0)
		{
			printf("%c => %d\n",C[i] ,A[i] );
		}		
	}

}
int main(){

	char *str="AnkanMukherjee";
	printf("%s\n",str );
	charSequence(str);
	return 0;
}