// Program to capitalize first and last letter of each word in a line. 
// The basic algorithm is to keep track of the spaces and capitalize the letter before the space and after space. 
// The first letter and the last letter of the given line should be capitalized. 
// There are only a few things that need to be considered:

//  More than one occurrence of spaces between two words.
//  There can be a single word like 'a' that needs to be capitalized.
//  There may be two words like "me" where both letters must be capitalized.
// Input: kiit university 
// Output: KiiT UniversitY

#include <stdio.h>

char smallToCapital(char c){
	char temp='\0';
	if ( c >= 97 && c <= (96+26) )
		{
			temp = (c-32);
		} else{
			temp = c;
		}
		return temp;
}

char capitalToSmall(char c){
	char temp='\0';
	if ( c >= 65 && c <= (64+26) )
		{
			temp = (c+32);
		} else{
			temp = c;
		}
		return temp;
}

void capitalizedLastLetter(char *str){

	char c[100];
	int j=0;

	for (int i = 0; str[i]!='\0'; ++i)
	{
		if (i==0 || str[i+1] == '\0')
		{
			// printf("\nif (i==0 || str[i+1] == '\0')\n");
			c[j] = smallToCapital(str[i]);
			j++;
		}
		// else if (str[i]!=' ' && str[i+1]==' '){
		// 	printf("\nLEFT SIDE CHAR && RIGHT SIDE SPACE\n");
		// 	c[j] = smallToCapital(str[i]);
		// }

		else if (str[i] == ' ')
		{
			if (str[i-1] != ' ' && str[i+1] != ' ' ){
				// printf("\nBOTH SIDE CHAR\n");
				c[j-1] =  smallToCapital(str[i-1]);
				c[j] = str[i];
				c[j+1] =  smallToCapital(str[i+1]);
				j+=2;
				i++;
			}else if (str[i-1] != ' ' && str[i] == ' ' ){
				// printf("\nLEFT SIDE CHAR\n");
				c[j-1] =  smallToCapital(str[i-1]);
				c[j] = str[i];
				j++;
			}
			else if (str[i] == ' ' && str[i+1] != ' '){
				// printf("\nRIGHT SIDE CHAR\n");
				c[j+1] =  smallToCapital(str[i+1]);
				j+=2;
				i++;
			}else{
				c[j] = str[i];
				j++;
				// printf("\nBOTH SIDE SPACE \t c[j-1]=%c \t c[j] = %c \t c[j+1] = %c\n",c[j-1],c[j],c[j+1]);
			}
		}

		else{
				// printf("\nELSE\n");
				c[j]=capitalToSmall(str[i]);
				j++;
			}
		
		// printf("str[%d] =>\t %c\n", i,str[i]);
		// printf("c[%d] =>\t %c\n",j-1, c[j-1]);
	}

printf("\n\nAFTER PERFORMING OPERATION\n");
	for (int i = 0; str[i]!='\0'; ++i)
	{
		printf("%c", c[i]);
	}
	printf("\n");

}
#include <stdio.h>

int main(){
	char *str = "My name Is AnKan mUkhERjee";
	printf("\nBEFORE OPERATION\n");
	
	for (int i = 0; *(str+i)!='\0'; ++i)
	{
		printf("%c", *(str+i));
	}

	printf("\n");
	capitalizedLastLetter(str);
	return 0;
}