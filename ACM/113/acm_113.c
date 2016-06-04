#include <stdio.h>
#include <math.h>

int main(int argc, char **argv)
{
    double n = 0, p = 0;
    while(scanf("%lf %lf", &n, &p) != EOF)
    {
       printf("%.0lf\n", pow(p, 1/n));
    }
    return 0;
}
