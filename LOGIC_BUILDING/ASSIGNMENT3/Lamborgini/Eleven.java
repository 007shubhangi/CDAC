/*11. Write a Java program to demonstrate the use of both pre-increment and post-decrement
operators in a single expression*/
class Eleven{
     public static void main(String args[])
    {
       int i = 1;
	   int result;
	   result = ++i + i + i-- + i;
	   System.out.println(result);
    }
}
//2 + 2 + 2 + 1 = 7