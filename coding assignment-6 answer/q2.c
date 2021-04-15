// Q2.  Program to check if two strings are anagrams or not. 
// 		Two strings are given as input and those strings have to be checked if they are anagrams or not. 
// 		Anagram means that both strings contain the same character set, only their order is different. 
// 		Therefore, in both strings, the frequency of each letter must be the same. For example, strings "act" and "cat" are anagrams.

#include <stdio.h>
#include <stdarg.h>

void isAnagrams(char *str1 , char *str2){
	int a1[26] = {0};
	int A1[26] = {0};
	char c1[26] = {'\0'};
	char C1[26] = {'\0'};

	int a2[26] = {0};
	int A2[26] = {0};
	char c2[26] = {'\0'};
	char C2[26] = {'\0'};

	int s=0;
	for (int i = 0; str1[i] != '\0'; ++i)
	{
		if (str1[i]>=97)
		{
			a1[str1[i]-'a']++;
			c1[str1[i]-'a'] = str1[i];
		}else{
			A1[str1[i]-'A']++;
			C1[str1[i]-'A'] = str1[i];
		}
		
	}

	for (int i = 0; str2[i] != '\0'; ++i)
	{
		if (str2[i]>=97)
		{
			a2[str2[i]-'a']++;
			c2[str2[i]-'a'] = str2[i];
		}else{
			A2[str2[i]-'A']++;
			C2[str2[i]-'A'] = str2[i];
		}
		
	}

	for (int i = 0; i < 26; ++i)
	{
		if (c1[i]!='\0'||c2[i]!='\0')
		{
			printf("\nc1[i] = %c\tc2[i] = %c",c1[i],c2[i] );
			if (c1[i] != c2[i])
			{
				s++;
			}	
		}

		if (C1[i]!='\0'||C2[i]!='\0')
		{
			printf("\nC1[i] = %c\tC2[i] = %c",C1[i],C2[i] );
			if (C1[i] != C2[i])
			{
				s++;
			}	
		}
	}

printf("\n%d\n",s );
	if (s>0)
	{
		// return TRUE;
		printf("NOT Anagram\n");
	}else{
		// return FALSE;
		printf("Anagram\n");
	}
	// return TRUE;

}
int main(){

	char *str1="dog";
	char *str2="cat";
	isAnagrams(str1,str2);
	// if(isAnagrams(str1,str2)){
	// 	printf("%a & %d are Anagram\n");
	// }else{
	// 	printf("%a & %d are NOT Anagram\n");
	// }
	return 0;
}