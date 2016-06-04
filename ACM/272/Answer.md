```
#include <stdio.h>

int main(int argc, char **argv)
{
    char temp;
    int even = 0;
    while((temp = getchar()) != EOF)
    {
        if(even == 1 && temp == '"')	// Have to check odd/even
        {
            putchar('\'');
            putchar('\'');
            even = 0;
        }
        else if(temp == '"')
        {
            putchar('`');
            putchar('`');
            even = 1;
        }
        else
        {
            putchar(temp);
        }
    }
    return 0;
}

```