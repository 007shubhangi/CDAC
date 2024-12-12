/*
 * Demo.cpp
 *
 *  Created on: 9 Dec 2024
 *      Author: user
 */
//comments are for documentation
#include <iostream>
using namespace std;
void Add();
int main() {

	Add();//ld error if we call function whose defination is not available
	cout<<"in main() method"<<endl;
	return 0;
}








