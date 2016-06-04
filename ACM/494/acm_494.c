#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
	char input[100];
	int word_count = 0;
	int i = 0;

	while(gets(input) != NULL)
	{
		word_count = 0;

		for(i=0 ; input[i]!='\0' ; i++)
		{
			if((isalpha(input[i]) > 0) && (isalpha(input[i+1]) == 0))
			{ 
				word_count++;
			}
		}
		printf("%d\n", word_count);
	}
	return 0;
}
