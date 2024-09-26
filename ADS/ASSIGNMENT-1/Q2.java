/*
-Program
	-Flow chart
	-Explanation
	-Output
	-Time and Space complexity
	
2. Prime Number
Problem: Write a Java program to check if a given number is prime.

Test Cases:

Input: 29
Output: true
Input: 15
Output: false

Flowchart:

Start
Create an instance of the Scanner class.
Declare a variable.
Ask the user to initialize the variable.
Call a user-defined method to find the square root of the number.
Declare a temporary variable.
Declare another variable to store the number/2 value.
Use a do-while loop to calculate the square root.
Calculate the square root of the number and return the value.
Now, print the square root of the number.
Stop
*/
import java.util.*;
public class Q2{
	public static int show(int num){
	for(i=2;i<n;i++){
		if(n%i==0)
			System.out.println("not prime no");
		
		if(i==2)
		System.out.println(" prime no");
	}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		int result=show(num);
		
    
       
	}
}
