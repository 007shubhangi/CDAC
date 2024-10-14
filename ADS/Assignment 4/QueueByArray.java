package P1;

import java.util.Scanner;


/*6. Implement a Queue using an array.
Test Case 1:
Input: Enqueue 5, Enqueue 10, Dequeue
Output: Queue = [10], Dequeued element = 5
Test Case 2:
Input: Enqueue 1, 2, 3, Dequeue, Dequeue
Output: Queue = [3], Dequeued elements = 1, 2
*/
public class QueueByArray {
	
	int arr[] , front , rare;
	
	public QueueByArray(int size) {
		arr = new int[size];
		front = -1;
		rare = -1;
	}
	
	
	//1. Enqueue::
	void enqueue (int val) {
		if(isFull()) {
			throw new RuntimeException("Queue is Full");
		}
		else {
			rare++;
			arr[rare] = val;
		}
		
		
			
	}
	
	//2. Dequeue ::
	void dequeue() {
		if(isEmpty())
			throw new RuntimeException("Queue is Empty");
		front++;
	}
	
	//3. peek():
	
	void peek() {
		if(isEmpty())
			throw new RuntimeException("Queue is Empty");
		System.out.println(arr[front+1]);
	}
	
	//4. isEmpty::
	
	boolean isEmpty() {
		return front == rare;
	}
	
	//5 isFull::
	boolean isFull() {
		return rare == arr.length-1;
	}
	
	
	
	
	
	
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
			
			QueueByArray queue = new QueueByArray(10);
				
			int choice , val;
				
			while((choice = QueueByArray.menuList()) != 0) {
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
