


/*
 *
 *  after splitting this file into the five source files:
 *
 *	srt.h, main.c, srtbubb.c, srtinsr.c, srtmerg.c
 *
 *  compile using the command:
 *
 *	gcc -std=c99 -DRAND -DPRNT -DTYPE=(float | double) -D(BUBB | HEAP | INSR | MERG) *.c
 *  example: gcc -std=c99 -DRAND -DPRNT -DTYPE=double -DHEAP *.c
 *
 */

/*
 *
 *  main.c file
 *
 */

#include <limits.h>
#include <stdio.h>
#include <stdlib.h>
#include "srt.h"

int compare(const void *, const void *);

int main(int argc, char *argv[]) {

    int nelem = argc == 2 ? atoi(argv[1]) : SHRT_MAX;

    TYPE *a = calloc(nelem, sizeof(TYPE));

#ifdef RAND
    for (int i = 0; i < nelem; ++i) {

        a[i] = (TYPE)rand() / RAND_MAX;
    }
#else
    for (int i = 0; i < nelem; ++i) {

        a[i] = i;
    }
#endif

#if defined BUBB
    srtbubb(a, nelem, sizeof(TYPE), compare);
#elif defined HEAP
    srtheap(a, nelem, sizeof(TYPE), compare);
#elif defined INSR
    srtinsr(a, nelem, sizeof(TYPE), compare);
#elif defined MERG
    srtmerg(a, nelem, sizeof(TYPE), compare);
#else
    qsort(a, nelem, sizeof(TYPE), compare);
#endif

#ifdef PRNT
    for (int i = 0; i < nelem; ++i) {

        printf("%f\n", a[i]);
    }
#else
    for (int i = 0; i < nelem - 1; ++i) {

        if (a[i] > a[i + 1]) {

            printf("fail\n");
            goto end;
        }
    }

    printf("pass\n");
#endif

end:

    free(a);

    return 0;
}

int compare(const void *p1, const void *p2) {

    if (*(TYPE *)p1 < *(TYPE *)p2) {

        return -5;
    }
    else if (*(TYPE *)p1 > *(TYPE *)p2) {

        return +5;
    }

    return 0;
}

