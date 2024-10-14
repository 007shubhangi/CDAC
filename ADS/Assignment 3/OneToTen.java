
package P1;

import java.util.Scanner;

public class OneToTen {
	
	
	public static int oneToTen(int n ) {
		
		if(n>1)
			oneToTen(n-1);
			System.out.println(n);
		return n;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		oneToTen(n);
		
	}

}
/*

public static int number(int n){
	
	if(n>1)
		number(n-1);
		System.out.println(n);
	return n;
	
	
	
	

}

int n = 10;
number(n); */
