/*
 * Q7_b.cpp
 *
 *  Created on: 12 Dec 2024
 *      Author: user
 */
/*
 * Q7.cpp
 7. Write a short program in both C and C++ that declares a structure, initializes it, and
    prints its members
 */

#include <stdio.h>
#include <stdlib.h>



  struct Book{
	int bookId;
	char bookName[20];
	float price;

	};
int main(int argc, char **argv) {
         setbuf(stdout, NULL);

			 struct Book b1;
			 void SetData(Book*);
			 void GetData(Book*);
			 SetData(&b1);
			 GetData(&b1);
	return 0;
}
void SetData(Book *b1){

	   printf("enter bookId \n");
		scanf("%d",&b1->bookId);

		printf("enter bookName \n");
		scanf("%s",b1->bookName);

		printf("enter price \n");
		scanf("%f",&b1->price);
}

void GetData(Book *b1){
	    printf("bookId : %d\n",b1->bookId);
		printf("bookName : %s\n",b1->bookName);
		printf("price : %f\n",b1->price);
}









