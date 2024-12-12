
#include <cstdio>
using namespace std;

int main(int argc, char **argv) {
	 int $num10=10;
	     printf("%d\n",$num10);

	int _num10=10;
		     printf("%d\n",_num10);
		     printf("\\t");

    const int num=100;
    //int *ptr=&num;// non const ponter cant store const variable address
    const int *ptr=&num;
    //*ptr=8100; //num is constant read only value cant chane
    printf(" value of num %d\n",num);//100
    //num=200; num is constant we cant modify it

    int num1=18950;
    const int *ptrNum=&num1;
    //num1=895;//poniter ptrNum make num1 constant

    const int num45=88;
    //int  *ptrNum3=&num3;
    const int *const ptrNum3=&num45;
    //ptrNum3= &num45;//NOT OK Constant pointer must initialize at time of Declaration
    printf("%d\n",num45);
    printf("%d\n",*ptrNum3);
    //*ptrNum3=85;//num45 is constanat we cant update its value
    printf("%d\n",num45);

    int number=7;
    int const *prtNumber=&number;
    //prtNumber=89;//make number constant not able to change value
    printf(" value of number %d \n ",number);//7

    const int number1=70;
       int *prtNumber1=&number;
       *prtNumber1=99;//make number constant // value not change
       printf("value of number1 %d \n",number1);//70


	return 0;
}
