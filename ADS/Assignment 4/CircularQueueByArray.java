package P1;

import java.util.Scanner;

/*7. Implement a Circular Queue using an array.
Test Case 1:
Input: Enqueue 4, 5, 6, 7, Dequeue, Enqueue 8
Output: Queue = [8, 5, 6, 7]
Test Case 2:
Input: Enqueue 1, 2, 3, 4, Dequeue, Dequeue, Enqueue 5
Output: Queue = [5, 3, 4]
*/



class CircularQ{
int arr[] , front , rare;
	
	public CircularQ(int size) {
		arr = new int[size];
		front = -1;
		rare = -1;
	}
	
	boolean isFull() {
		return (front == -1 &&  rare == arr.length-1) || (front == rare && front != -1) ;
	}
	
	boolean isEmpty() {
		return ((front == rare && front == -1));
	}
	
	
	void enqueue(int val) {
		if(isFull()) {
			throw new RuntimeException("Queue is Full");
		}
		else {
			rare = (rare+1)%arr.length;
			arr[rare] = val;
		}
		
	}
	
	
	void dequeue () {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		else {
			front = (front+1)%arr.length;
		}
		
		if(front == rare) {
			front = -1;
			rare = -1;
		}
		
	}
	
	void peek() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		else {
			int index = (front+1)%arr.length;
			System.out.println(arr[index]);
		}
		
		
	}
	
	
	
}






public class CircularQueueByArray {
	

	
	
	
	
	
private static Scanner sc = new Scanner(System.in);
	
	/*******************************************************/
			
			//menuList::
		public static int menuList() {
				
				System.out.println("push 1");
				System.out.println("pop  2");
				System.out.println("peek 3");
				System.out.println();
				
				System.out.print("Enter choice:: ");
				int choice = sc.nextInt();
				return choice;
			}

	/*******************************************************/	
		
		public static void main(String[] args) {
			
			CircularQ queue = new CircularQ(10);
				
			int choice , val;
				
			while((choice = CircularQueueByArray.menuList()) != 0) {
				switch(choice) {
					case 1: //push()
						try {
							System.out.print("enqueue queue ::");
							val = sc.nextInt();
							queue.enqueue(val);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
							break;
					case 2 : //pop();
						try {
							System.out.print("dequeue queue :: ");
							queue.peek();
							queue.dequeue();
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
							break;
							
					case 3 : //peek();
						try {
							System.out.print("Next dequeue queue ::");
							queue.peek();
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
							break;
							
						
				
				}
			}
		
			
			
			
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
