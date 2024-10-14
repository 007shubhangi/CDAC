package P1;

import java.util.Scanner;

/*
1. Printing Patterns
Problem: Write a Java program to print patterns such as a right triangle of stars.

*/

public class StarPattern {
	
	
	public static void starPattern(int n) {
		
		for(int i =0; i<n; i++) {
			for(int j = 0 ; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number for Triangle pattern:: ");
		int n = sc.nextInt();
		starPattern(n);
		
	}

}
