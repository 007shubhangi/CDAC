/*5)Write a program that allows the user to select a shape (Circle, Square, Rectangle, Triangle) and then calculates the area based on user-provided dimensions using a switch case.
*/
import java.util.Scanner;

class Q5{
    public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("select a shape for Circle c, for Square s, for Rectangle r, for Triangle t");
	char shape = sc.next().charAt(0);
	switch(shape)
	{
		case 'c':
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter radius");
		double r = sc1.nextDouble();
		double area_C = 3.14 * r * r;
		System.out.println(area_C);
		break;
		
		case 's':
	    Scanner sc2 = new Scanner(System.in);	
		System.out.println("enter side");
		int side = sc2.nextInt();
		int area_S = side * side;
		System.out.println(area_S);
		break;
		
		case 'r':
		Scanner sc3 = new Scanner(System.in);	
		System.out.println("enter length");
	    int length = sc3.nextInt();
		System.out.println("enter breath");
	    int breadth = sc3.nextInt();
		int area_R = length * breadth;
		System.out.println(area_R);
		break;
		
		case 't':
        Scanner sc4 = new Scanner(System.in);	
		System.out.println("enter base");
		int base = sc4.nextInt();
		System.out.println("enter height");
		int height = sc4.nextInt();	
		int area_T = (base * height) / 2;
		System.out.println(area_T);
		break;
		
	}
		
		
	}
}