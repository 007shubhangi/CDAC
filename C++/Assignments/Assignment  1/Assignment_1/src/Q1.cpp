/*
 * Q1.cpp
 *
 *  Created on: 12 Dec 2024
 *      Author: user
 *   1. Write a program to declare a pointer, initialise it with the address of a variable, and
    print the value using both the pointer and the variable. Demonstrate pointer
    assignment using two integer variables
 *
 */
#include <stdio.h>
int main(int argc, char **argv) {
	int num1=100;
	int *ptrNum=&num1;
	printf("value of num1 by using variable: %d\n",num1);
	printf("value of num1 by using pointer : %d\n",*ptrNum);

	int num2=200,num3=300;
	ptrNum=&num2;
	printf("value of num2 by using variable: %d\n",num2);
	printf("value of num2 by using pointer : %d\n",*ptrNum);

	ptrNum=&num3;
	printf("value of num3 by using variable: %d\n",num3);
	printf("value of num3 by using pointer : %d\n",*ptrNum);

	return 0;
}




