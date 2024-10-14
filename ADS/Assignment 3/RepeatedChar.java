package P1;

import java.util.Arrays;
import java.util.Scanner;

/*7. Find Repeated Characters in a String
Problem: Write a Java program to find all repeated characters in a string.

Test Cases:

Input: "programming"
Output: ['r', 'g', 'm']
Input: "hello"
Output: ['l']
*/

public class RepeatedChar {
	
	static  int reverseNumber(int n) {
	    if (n == 0) return 0;
	    return n % 10 + reverseNumber(n / 10);
	}
	
	

		
		
		public static void main(String[] args) {
			
			
			System.out.println(reverseNumber(1234));			
			int[] arr = {2, 4, 6, 8};
			for (int i = 0; i < arr.length; i++) {
			    if (i % 2 == 1) arr[i] = arr[i] / 2;
			}
			System.out.println(Arrays.toString(arr));
			
			

			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	
	
}
