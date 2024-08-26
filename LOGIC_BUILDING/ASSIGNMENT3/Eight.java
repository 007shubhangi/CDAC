public class Eight {
public static void main(String[] args) {
int num = 1;
do {
System.out.println(num);//1
++num;
} while (num < 6);
}
}
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the
//numbers from 1 to 5?

//it prints 1 . then decrement decrease value to 0. condition is false. loop terminates.
//