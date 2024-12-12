/*
 * Demo.cpp
 *
 *  Created on: 9 Dec 2024
 *      Author: user
 */
//comments are for documentation
#include <iostream>
using namespace std;
void Add();//Global Declaration

void Add1(){
	cout<<"inside Add() method "<<endl;
}

int main() {

	cout<<"in main() method"<<endl;
	Add1();//Function Call
	int Add(int a,int b);//Local Declaration
	int result=Add(2,5);
	cout<<"result of Add() having 2 arg is : "<<result;
	return 0;
}


int Add(int a,int b);
//function Defination
void Add(){
	cout<<"inside Add() method "<<endl;
	Add(8,1);
}
int Add(int a,int b){
	cout<<"inside Add(int a,int b) method "<<endl;
	int c=a+b;
	return c;
}






