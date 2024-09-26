/*
4. Fibonacci Series
Problem: Write a Java program to print the first n numbers in the Fibonacci series.

Test Cases:

Input: n = 5
Output: [0, 1, 1, 2, 3]
Input: n = 8
Output: [0, 1, 1, 2, 3, 5, 8, 13]

*/
public class Q4{
		static int fib(int n){
		if (n <= 1)
		{
				return n;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String args[])
	{
		int num=10;
		
		for(int i=0;i<=num;i++)
		{
			System.out.print(fib(i)+" ");
		}
		
	}
}