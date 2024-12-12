/*
 * Q_3.cpp
 *
 *  3. Create a program to demonstrate the use of NULL and its importance in pointer
initialisation. Write code to check for NULL before dereferencing a pointer
 */

#include <stdio.h>;
int main(int argc, char **argv) {

	int *ptr=NULL;
	printf("pointer initialized to null \n");

	if(ptr==NULL){
		printf("pointer is NULL so cant dereference \n");
	}
	else{
		printf("value of ptr : %d",*ptr);
	}
	return 0;
}




