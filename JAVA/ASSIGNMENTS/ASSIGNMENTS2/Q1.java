/*
1)Write a program that checks if a given year is a leap year or not using both if-else and switch-case.
*/
import java.util.Scanner;
/*
using if-else 
	
class Q1{
   public static void main (String args[])
    {
     Scanner sc =  new Scanner(System.in);
	 System.out.println("enter year");
	 int year = sc.nextInt();
	 if ((year%4==0) && (year%100!=0) || (year%400==0))
	 {
		System.out.println(year + " is leap year");
	 }
	 else
		System.out.println(year + " is not a leap year");

    }
}
*/

//Using switch-case
class Q1{
   public static void main (String args[])
    {
     Scanner sc =  new Scanner(System.in);
	 System.out.println("enter year");
	 int year = sc.nextInt();
	 
	 int a =(year%4==0 && year%100!=0 || year%400==0)? 1 : 0;
	 switch(a)
	 {
		 case 1:
		System.out.println(year + " is leap year");
		break;
	     
		case 0:
		System.out.println(year + " is not a leap year");

    }
	}
}