package P1;

import java.util.Scanner;

/*1. Armstrong Number
Problem: Write a Java program to check if a given number is an Armstrong number.

Test Cases:

Input: 153
Output: true
Input: 123
Output: false
*/

public class ArmstrongNum {
	
	
	public static int armStrong(int num) {
		
	
		if(num==0)
			return 0;
		return (int)Math.pow(num%10, 3)+armStrong(num/10);
			
			
		
		
		
	}
	
	
	

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Enter Numeber:: ");
		
		int num = sc.nextInt();
		
		int x = armStrong(num);
		
		if(x==num)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not Armstrong");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
