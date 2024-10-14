package P1;

import java.util.*;

/*
3. Reverse a string using a stack.
Test Case 1:
Input: "hello"
Output: "olleh"
Test Case 2:
Input: "world"
Output: "dlrow"
*/





public class ReverseString {
	
	
	static String reverseString(String string) {
		
		char arr [] = new char [string.length()];
		Stack <Character> stack = new Stack<Character>();
		
		
		for(int i = 0 ; i < string.length() ; i++) {
			
			stack.push(string.charAt(i));
			
		}
		
		int i = 0 ;
		while(!stack.isEmpty()) {
			
			arr[i++] = stack.pop();
			
		}
		
	

		return new String(arr);
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER STRING:: ");
		String string = sc.nextLine();
		
		System.out.println("Before:: " +string);
		
		
		String str = reverseString(string);
		
		System.out.print("after:: " +str);
		
		if(str == string) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
