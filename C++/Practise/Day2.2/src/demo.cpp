
#include <cstdio>
using namespace std;

int main(int argc, char **argv) {
    int num=100;
    int *ptr=&num;
    printf("%d\n",num);
    printf("%p\n",&num);
    printf("%p\n",ptr);
    printf("%p\n",&ptr);
    printf("%d\n",*ptr);
    printf("%d\n",sizeof(ptr));

    //int *ptr1;//wild pointer
    int *ptr1=NULL;
    printf("%d",ptr1);
	return 0;
}
