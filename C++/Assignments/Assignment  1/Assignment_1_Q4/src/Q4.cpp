/*
 * 4. Write code to show the behaviour of pointers with const qualifier in various scenarios:
i. Pointer to a const value.
ii. const pointer to a value.
iii. const pointer to a const value
 */

#include <stdio.h>
int main(int argc, char **argv) {
	//i. Pointer to a const value.
    const int num=10;
	const int *ptr=&num;
	printf("value of num  %d\n",*ptr);//10 OK
	//*ptr=20;// NOT OK num is constant variable we can't change its value (READ ONLY)


	//ii. const pointer to a value.
	int num2=20,num3=30;
    int *const ptr1=&num2;
	*ptr1=40;//OK variable is not constant so it can update
	printf("value of num2  %d\n",*ptr1);//40
	//ptr1=&num3;//NOT OK ptr1 is constant pointer.It cannot store adress of any other variable

	//iii. const pointer to a const value.
	const int num4=20;
	const int *const ptr2=&num4;
	//*ptr2=40;//NOT OK variable is constant(READ ONLY) so it cannot update
	//ptr2=&num3;//NOT OK Pointer is also constant(READ ONLY) so cannot store adress of another variable
	printf("value of num2  %d\n",*ptr2);//20

	return 0;
}



