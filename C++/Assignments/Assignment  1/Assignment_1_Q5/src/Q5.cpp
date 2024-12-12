/*
 * Q5.cpp
 * Write a program demonstrating the difference between const int *ptr,
 *  int *const ptr, and const int *const ptr
 */
#include <stdio.h>
int main(int argc, char **argv) {
	const int num1=11;
	const int *ptr=&num1; //ptr is non constatant local pointer variable which is ready to store address of integer constant variable
	printf("value of num1 : %d\n",num1);
	printf("value of num1 : %d\n",*ptr);
	//*ptr=55; NOT OK num1 is (READ ONLY)
	//printf("value of num1 : %d",*ptr);

	int num2=31,num3=5;
	 int *const ptr1=&num2;//ptr1 is constant(READ ONLY) local pointer variable ready to store address of non constant variable
	 printf("value of num2 : %d\n",num2);
	 printf("value of num2 : %d\n",*ptr1);
	// ptr1=&num3; //ptr1 is contatant pointer not able to store adress of another variable
	 printf("value of num2 : %d\n",*ptr1);


	 const int num4=74;
	 const int *const ptr3=&num4;
	 //*ptr3=45;//NOT OK num4 is READ ONLY Variable
     //ptr3=&num3;//NOT OK ptr3 is READ ONLY pointer
     printf("value of num4 : %d\n",num4);
     printf("value of num4 : %d\n",*ptr3);
	 return 0;
}




