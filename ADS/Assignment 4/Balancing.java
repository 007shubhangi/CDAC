package P1;

/*Check for balanced parentheses using a stack.
Test Case 1:
Input: "({[()]})"
Output: Balanced
Test Case 2:
Input: "([)]"
Output: Not Balanced
*/



import java.util.Scanner;
import java.util.Stack;

public class Balancing {

	
	public static boolean isBalanced(String str) {
		
		Stack <Character> stack = new Stack<>();
		
		String open = "({[", close = ")}]";
		
		for(int i = 0 ; i<str.length(); i++) {
			
			char sym = str.charAt(i);
			
			
			if(open.indexOf(sym) != -1) 
				stack.push(sym);
			
			
			else if(close.indexOf(sym) != -1) {
				
				if(stack.isEmpty())
					return false;
				
				char pop = stack.pop();
			
			
			
				if(close.indexOf(sym) != open.indexOf(pop)  ) {
					return false;
				}
			
			}
			
			
		}
				
		
		
		return stack.isEmpty();
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String infix = sc.nextLine();
		
		boolean balanced = isBalanced(infix);
		
		if(balanced == true) {
			System.out.println("balanced");
		}
		else {
			System.out.println("Not balanced");
		}
		
		
	}
}
