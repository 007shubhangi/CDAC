package P1;

import java.util.Arrays;

/*. Implement a Stack using an array.
Test Case 1:
Input: Push 5, 3, 7, Pop
Output: Stack = [5, 3], Popped element = 7
Test Case 2:
Input: Push 10, Push 20, Pop, Push 15
Output: Stack = [10, 15], Popped element = 20

*/



import java.util.Scanner;



class Stackers{
	
	private int arr[];
	private int top;
	
	
	public Stackers(int size) {
		arr =  new int [size]; 
		top = -1;
	}
	
/****************************************************/	
	//1 push::
	void push(int val) {
		if(isFull())
			throw new RuntimeException("Stack is Full");
		else {
			top++;
			arr[top]= val;
		}
		
	}
/****************************************************/	
	//2 pop::
	void pop() {
		if(isEmpty())
			throw new RuntimeException("Stack is Empty");
		else {
			top--;
		}
		
	}
/****************************************************/	
	//3 peek::
	void peek() {
		if(isEmpty())
			throw new RuntimeException("Stack is Empty");
		
		System.out.println(arr[top]);
	}
/****************************************************/	
	//4 isEmpty::
	boolean isEmpty() {
		return top == -1;
	}
/****************************************************/	
	//5 isFull::
	boolean isFull() {
		return top == arr.length-1;
	}
	
/****************************************************/
	
	
	
	
	void output() {
		for (int i = top ; i>-1 ; i--) {
			System.out.println(arr[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}

public class StackMain {
	
	private static Scanner sc = new Scanner(System.in);
	
/*******************************************************/
		
		//menuList::
	public static int menuList() {
			
			System.out.println("push 1");
			System.out.println("pop  2");
			System.out.println("peek 3");
			System.out.println("output 4");
			System.out.println();
			
			System.out.print("Enter choice:: ");
			int choice = sc.nextInt();
			return choice;
		}

/*******************************************************/	
	
	public static void main(String[] args) {
		System.out.print("Enter array Size:: ");
		Stackers stack = new Stackers(sc.nextInt());
			
		int choice , val;
		int[] arr;
			
		while((choice = StackMain.menuList()) != 0) {
			switch(choice) {
				case 1: //push()
					try {
						System.out.print("Enter stack ::");
						val = sc.nextInt();
						stack.push(val);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
						break;
				case 2 : //pop();
					try {
						System.out.print("pop Stack :: ");
						stack.peek();
						stack.pop();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
						break;
						
				case 3 : //peek();
					try {
						System.out.print("Next pop stack ::");
						stack.peek();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
						break;
				case 4 : 
					stack.output();
					break;
			
			}
		}
	
		
		
		
		
	}

}
