// Program to replace the substring of a given string with another string. 
// The substring may be more than once in the string and you have to replace all. 

// Input: String : ram is a good boy 
// 	   	  Substring: is 
// 	   	  Replace String: was 

// Output: ram was a good boy

#include <stdio.h>
void replaceSubString(char *str , char *subStr , char *repStr){

	char word[10]={'\0'} , str1[100]={'\0'} ;
	int j=0,i=0,k=0;



	char ss[10]={'\0'};
	int a=0;
	for (i = 0; subStr[i] != '\0'; ++i)
	{
		ss[a] = subStr[i];
		a++;
	}
	printf("%s\n", ss);



	char rs[10]={'\0'};
	int b=0;	
	for (i = 0; repStr[i] != '\0'; ++i)
	{
		rs[b] = repStr[i];
		b++;
	}
	printf("%s\n", rs);


	j=0;
	for (i = 0; str[i]!='\0'; ++i)
	{


		if (str[i] == 32)
		{
			printf("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
			printf("\nword =  %s\n", word);
			printf("\nstr1 = %s\n", str1);
			printf("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\n");
			if (word == ss)
			{
				printf("AAAAAA\n");
			}
			word[10] = '\0';
			j=0;
		}

		word[j] = str[i];
		j++;
		str1[k]=str[i];
		k++;
		

		printf("\nword =  %s\n", word);
		printf("\nstr1 = %s\n", str1);

		printf("%c\n",str[i]);
	}
	


}

int main(){
	char *str = "ram is a good boy";
	char *subStr = "is";
	char *repStr = "was";

	// char a[5] = "abc";
	// char b[5] = "xyz";
	// printf("a = %s b = %s \n",a,b );

	replaceSubString(str,subStr,repStr);

	return 0;
}