/*
 ============================================================================
 Name        : arraymulti.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */
#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int a[500],b[500];
    int size,i;
    setbuf(stdout,NULL);
	printf("enter the size of arrays");
	scanf("\n%d",&size);
	printf("Enter the values of Array ");
	for(i=0;i<size;i++){
		scanf("\n%d",&a[i]);
	}
	printf("multiplied array is:");
	for(i=0;i<size-1;i++){
		b[i]=a[i]*a[i+1];

	}
	for(i=0;i<size-1;i++){
	printf("\t%d",b[i]);}
	return EXIT_SUCCESS;
}
