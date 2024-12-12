/*
 * Demo.cpp
 *
 *  Created on: 9 Dec 2024
 *      Author: user
 */
//comments are for documentation
#include <iostream>
using namespace std;
int main(int argc, char **argv) {
	int num1;//Declaration
	num1=100;//decln + initialization
	num1=1000;//assignment
	int num2;
	num2=200;//initialization
	//int num2 = 500; redeclaration in same scope is not allowed
	cout<<"value of num1 : "<<num1 <<" and "<<"value of num2 : " << num2;
	return 0;
}
 int main1(int argc, char **argv) {
	int num1;//num1 is a local variable holding GV
	cout<<"value of num1 : "<<num1;
	return 0;
}





