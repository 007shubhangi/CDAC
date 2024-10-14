package P1;

import java.util.Scanner;
import java.util.Stack;

/*
5. Convert an infix expression to postfix using a stack.
Test Case 1:
Input: "A + B * C"
Output: "A B C * +"
Test Case 2:
Input: "A * B + C / D"
Output: "A B * C D / +"
*/


public class InfixToPostfix {
	
	private static int pri(char operator) {
			
			switch(operator) {
				case '$' : return 10;
				case '*' : return 7;
				case '/' : return 7;
				case '+' : return 7;
				case '-' : return 7;
			
			}
			
			return 0;
			
		}
		
		
	static String infixToPostfix(String infix) {
	
		Stack < Character> stack =new Stack<Character>();
		
		StringBuilder postfix = new StringBuilder();
		
		for(int i = 0 ; i<infix.length(); i++) {
			
			char sym = infix.charAt(i);
			
			if(Character.isLetterOrDigit(sym))
				postfix.append(sym);
			
			else {
				while(pri(stack.peek()) > pri(sym)) {
					
					postfix.append(stack.pop());
				}
				
				
//				if(sym == '(')
//					stack.push(sym);
				
//				if(sym == ')') {
//					while(stack.peek() != '(') {
//						postfix.append(stack.pop());
//						stack.pop();
//					}
//					
//				}
				
			}
				
			
			
		}
		while(!stack.isEmpty()) {
			postfix.append(stack.pop());
			
		}
		
	
		
		return postfix.toString();
		
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter infix:: ");
		String infix = sc.nextLine();
		
		
		String str = infixToPostfix(infix);
		
		System.out.println(str);
		
		
		
		
		
		
		
		
	}

}
