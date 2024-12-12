/*
 * 2. Write a program that explains the concept of a wild pointer
 *  and how it can lead to undefined behaviour. Show how initialising a
    pointer can resolve this issue
 */
#include <stdio.h>
int main(int argc, char **argv) {
	//int *ptr;
	//printf("value at prt",*ptr);
	//this cause undefined behaviour when we declare pointer but not initialize it

	//resolve by using NULL Macro
	int *ptr=NULL;
	int num=10;
	ptr=&num;
	printf("value of ptr %d",*ptr);
	return 0;
}




