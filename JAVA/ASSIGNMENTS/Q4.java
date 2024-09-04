/*4)Write a program that takes a month (1-12) and prints the corresponding season (Winter, Spring, Summer, Autumn) using a switch case
*/
import java.util.Scanner;

class Q4{
    public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Month between 1-12");
	int month = sc. nextInt();
	switch(month)
	{
		case 1:
		case 2:
		case 3:
		System.out.println("WINTER");
		break;
		
		case 4:
		case 5:
		case 6:
		System.out.println("SPRING");
		break;
		
		case 7:
		case 8:
		case 9:
		System.out.println("SUMMER");
		break;
		
		case 10:
		case 11:
		case 12:
		System.out.println("AUTUMN");
		break;
		
		default:
		System.out.println("put wrong month");
		break;
		
	}
		
		
	}
}