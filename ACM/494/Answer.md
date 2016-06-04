```
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
    char input[100];    // for store input strings
    int word_count = 0; // count words
    int i = 0;

    // while input string not empty
    while(gets(input) != NULL)
    {
        word_count = 0;

        // count to end of string
        for(i=0 ; input[i]!='\0' ; i++)
        {
            // if find a char which is not a alphabet
            if((isalpha(input[i]) > 0) && (isalpha(input[i+1]) == 0))
            {
                word_count++;
            }
        }
        printf("%d\n", word_count);
    }
    return 0;
}
```
