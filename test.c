#include <stdio.h>
void main()
{
    int x = 10;
    int *ptr = &x;
    int i = 0;
    for (i = 0; i < 10; i++)
    {
        printf("%d\n", *ptr++);
        /* code */
    }

    // printf("%d", *ptr++);
}