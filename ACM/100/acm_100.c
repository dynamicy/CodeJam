#include <stdio.h>

int cal(int, int);
int max_cycle(int, int);

int max_cycle(int start, int end)
{
    int max = 0, i = 0;
    
    if(start > end)
    {
        int temp = start;
        start = end;
        end = temp;
    }

    for(i=start; i<=end; i++)
    {
        int count = 0;
        int temp = cal(i, count);
        if(temp >= max)
        {
            max = temp;
        }
    }
    return max;
}

int cal(int n, int count)
{
    count ++;

    if(n == 1)
    {
        return count;
    }
    else
    {
        if((n % 2) == 0)
        {
            return cal((n / 2), count);
        }
        else
        {
            return cal((3 * n + 1), count);
        }
    }
}

int main(int argc, char **argv)
{
    int start = 0, end = 0;

    while(scanf("%d %d", &start, &end) != EOF)
    {
        printf("%d %d %d\n", start, end, max_cycle(start, end));
    }
    return 0;
}
