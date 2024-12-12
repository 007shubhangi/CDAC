/*
 * Q6.cpp
 *
 * 6. Create a program that demonstrates how type-casting a const pointer can lead to
unexpected behaviour.

 */
#include <stdio.h>

int main(int argc, char **argv) {
	const int num=10;
	//int *ptr1=&num;//invalid conversion from 'const int*' to 'int*'
	int *ptr1=(int*)&num;//explixcit typecasting
	*ptr1=1000;//num is (READ ONLY) but due to type casting its value change which is unexpected
	printf("%d",*ptr1);//1000 Unexpected behaviour

	return 0;
}



