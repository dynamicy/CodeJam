```
#include <stdio.h>

int main(int argc, char **argv)
{
    int t=0, v=0;
    while(scanf("%d %d", &t, &v) != EOF)	//displace = 2*t * v 
    {
        printf("%d\n", 2*t*v);
    }
    return 0;
}

```