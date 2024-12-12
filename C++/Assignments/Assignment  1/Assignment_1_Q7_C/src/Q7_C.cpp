/*
 * Q7_C.cpp
 *
 *  Created on: 12 Dec 2024
 *      Author: user
 */

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
void SetData();
void GetData();
  struct Book{
	int bookId;
	char bookName[20];
	float price;
	void SetData(){

		   printf("enter bookId \n");
			scanf("%d",&bookId);

			printf("enter bookName \n");
			scanf("%s",bookName);

			printf("enter price \n");
			scanf("%f",&price);
	}

	void GetData(){
		    printf("bookId : %d\n",bookId);
			printf("bookName : %s\n",bookName);
			printf("price : %f\n",price);
	}
	};
int main(int argc, char **argv) {
         setbuf(stdout, NULL);

			 struct Book b1;
			 b1.SetData();
			 b1.GetData();
	return 0;
}













