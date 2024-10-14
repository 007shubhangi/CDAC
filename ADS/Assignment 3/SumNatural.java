package P1;

import java.util.Scanner;

//sum of natural numbers


public class SumNatural {
	
	
	public static int sumNatural(int n) {
	
	

		
		
		
		if(n<0)
			return 0;
		return n+sumNatural(n-1); 
		
		/*if(n==1)
			return 1;
		
		return n+sumNatural(n-1);*/

		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:: ");
		int n = sc.nextInt();
		
		int x =sumNatural(n);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
