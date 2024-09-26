/*
3. Factorial
Problem: Write a Java program to compute the factorial of a given number.

Test Cases:

Input: 5
Output: 120
Input: 0
Output: 1

-Program
	-Flow chart
	-Explanation
	-Output
	-Time and Space complexity
	
*/

import java.util.*;
public class Q3{
	public static int fact(int num){
		   int fact=1;
		   if(num<=0) return 1;
 
	       else
			    return num * fact(num - 1);
 
	}
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		System.out.println(fact(num));

		
}}
//Time Complexity: O(n)