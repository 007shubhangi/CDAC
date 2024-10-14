package P1;

/*Problem: Write a Java program to compute the factorial of a given number.

Test Cases:
3. Factorial

Input: 5
Output: 120
Input: 0
Output: 1
*/


import java.util.Scanner;

class Factorial{
	
	public static int factorialOf(int n) {
		
		if (n==0)
			return 1;
		
		return n*factorialOf(n-1);
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:: ");
		int n = sc.nextInt();
		int x = factorialOf(n);
		
		System.out.println(x);
		
		
	}
	
}


