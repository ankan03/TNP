// Program to find the first non-repeating character in a string. 
// Input: teeterson 
// Output: r

#include <stdio.h>
#include <stdarg.h>

void firstNonRepeatingCharacter(char *str){
	int a[26] = {0};
	int A[26] = {0};

	char c[26] = {'\0'};
	char C[26] = {'\0'};

	int frequencyChar[26] = {0};
	char sequenceChar[26] = {'\0'};
	int j=0,i=0;

	for (i = 0; str[i] != '\0'; ++i)
	{
		if (str[i]>=97)
		{
			a[str[i]-'a']++;
			c[str[i]-'a'] = str[i];
			sequenceChar[j] = str[i];
			j++;
		}else{
			A[str[i]-'A']++;
			C[str[i]-'A'] = str[i];
			sequenceChar[j] = str[i];
			j++;
		}
		
	}

	j=0;
	for (i = 0; str[i]!='\0'; ++i)
	{
		if (sequenceChar[i]>=97){
			frequencyChar[j] = a[sequenceChar[i]-'a'];
			j++;
		}else{
			frequencyChar[j] = A[sequenceChar[i]-'A'];
			j++;
		}
		
	}

	for (i = 0; i<j; ++i)
	{
		if (frequencyChar[i] == 1)
		{
			printf("\n Answer = %c\n", sequenceChar[i]);
			break;
		}
	}

	if (i==j)
	{
		printf("No non-repeating character found\n");
	}
	
}
int main(){

	char *str="aabbcc";
	printf("%s\n",str );
	firstNonRepeatingCharacter(str);
	return 0;
}