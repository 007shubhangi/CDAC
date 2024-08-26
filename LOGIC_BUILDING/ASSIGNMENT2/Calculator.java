/*
Question 3: Calculator
Write a program that acts as a simple calculator. It should accept two numbers and an operator
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if  else
to check if division by zero is attempted and display an error message.
*/

import java.util.Scanner;
class Calculator{
    public static void main(String args[]){
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("CHOOSE OPERATOR +,-,*,/");
		char operator = sc.next().charAt(0);


		
		System.out.println("ENTER NUM1");
		int num1 = sc.nextInt();
		
	    System.out.println("ENTER NUM2");	
		int num2 = sc.nextInt();
		
		
		switch(operator){
		 case '+':
		 result = num1 + num2;
		 System.out.println("Addition of " + num1 + " and " + num2 + " = " + result);
		 break;
		 
		 case '-':
		 result = num1 - num2;
		 System.out.println("Substraction of " + num1 + " and " + num2 + " = " + result);
		 break;
		 
		  case '*':
		 result = num1 * num2;
		 System.out.println("Multiplication of " + num1 + " and " + num2 + " = " + result);
		 break;
		 
		  case '/':
		 result = num1 / num2;
		 System.out.println("Diviion of " + num1 + " and " + num2 + " = " + result);
		 break;
		 
		 default:
		 System.out.println("enter (+, -, *, /) valid operator" );
		}
	 
	}
}
