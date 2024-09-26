/*5. Find GCD
Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.

Test Cases:

Input: a = 54, b = 24
Output: 6
Input: a = 17, b = 13
Output: 1
*/
import java.util.*;
public class Q5{
	
	static int gcd(int a, int b){
		
		if(b==0) 
			return a;
		else
			return gcd(b,a%b);
		
	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(gcd(a,b));
	
	}
}