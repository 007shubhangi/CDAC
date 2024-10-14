package P1;

import java.util.Scanner;

/*9. Integer Palindrome
Problem: Write a Java program to check if a given integer is a palindrome.

Test Cases:

Input: 121
Output: true
Input: -121
Output: false
*/


public class Palindrome {
	
	public static boolean palindrome(int a) {
		
		if(a<0) 
			return false;
		
		return true;
	}
	
	

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number:: ");
		int x = sc.nextInt();
		
		boolean z = palindrome(x);
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		
		
	}

}
