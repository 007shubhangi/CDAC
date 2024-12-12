/*
 * demo.cpp
 *
 *  Created on: 10 Dec 2024
 *      Author: user
 */

#include <cstdio>
using namespace std;
int ADD(int a,int b);//Global Declaration
int main(int argc, char **argv) {
	unsigned int num= 100;
	printf(" value of num :  %d\n",num);
	printf(" address of num : %p\n",&num);
	printf(" size of num : %d\n",sizeof(num));

	typedef int INTEGER;
	INTEGER NUMBER=12;
	printf(" value of num :  %d\n",NUMBER);
	printf(" address of num : %p\n",&NUMBER);
	printf(" size of num : %d\n",sizeof(NUMBER));


	int num2;//declaration + defination
	num2=100;//initialization
	num2=45;//assignment
	//int num2;//redeclation and defination not allowed

	int result=ADD(10,5);//Function Call (paramters)
	printf("Result is : %d",result);
	return 0;
}

int ADD(int a,int b)//Function Defination (parameter)
{
	int c =a+b;
	return c;
}



