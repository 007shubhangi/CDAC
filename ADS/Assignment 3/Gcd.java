package P1;

import java.util.Scanner;

/*5. Find GCD
Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.

Test Cases:

Input: a = 54, b = 24
Output: 6
Input: a = 17, b = 13
Output: 1

*/

public class Gcd {





	public static int gcd(int a, int b) {
		
		if(b==0) return a;
		
		return gcd(b,a%b);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:: ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int z = gcd(x,y);
		
		System.out.println("gcd of "+ x +" and "+ y + " :: " + z);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
