package P1;

/*
4. Evaluate a postfix expression using a stack.
Test Case 1:
Input: "5 3 + 2 *"
Output: 16
Test Case 2:
Input: "4 5 * 6 /"
Output: 3
*/






import java.util.Scanner;
import java.util.Stack;

public class Postfix {
	
	
	private static int calc(int a , int b , char operator) {
		
		switch(operator) {
			case '$' : return (int) Math.pow(a, b);
			case '*' : return a*b;
			case '/' : return a/b;
			case '+' : return a+b;
			case '-' : return a-b;
		
		}
		
		return 0;
		
	}
	
	
	
	public static int solvePostfix(String post) {
		
		Stack <Integer> stack = new Stack<>();
		
		for(int  i = 0 ; i< post.length(); i++ ) {
			
			char sym = post.charAt(i);
			
			if(Character.isDigit(sym)) {
				
				String oprands = Character.toString(sym);
				
				int val = stack.push(Integer.parseInt(oprands));
				
				
			}
			else {
				
				int b = stack.pop();
				int a = stack.pop();
				
				int c = calc(a,b,sym);
				
				stack.push(c);
			}
			
			
		}
	
		
		return stack.pop();
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String:: ");
		
		String postfix = sc.nextLine();
		
		int result = solvePostfix(postfix);
	
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
















	
}
