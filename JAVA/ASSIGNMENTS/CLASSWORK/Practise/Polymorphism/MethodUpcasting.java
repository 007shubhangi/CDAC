import java.util.Scanner;

class Shape{
	protected float area;
	public Shape() {
	}
	public void calculateArea( ) {
		
	}
	public float getArea() {
		return this.area;
	}
}
class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	public Rectangle() {
	}
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public void calculateArea( ) {
		this.area = this.length * this.breadth;
	}
}

class Circle extends Shape{
	private float radius;
	
	public Circle() {
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void calculateArea( ) {
		this.area = (float) (Math.PI * Math.pow(radius, 2));
	}
}
public class MethodUpcasting{
	private static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(Shape shape) {
		if( shape instanceof Rectangle ) {
			Rectangle rect = (Rectangle) shape;	//Downcasting
			System.out.print("Length	:	");
			rect.setLength(sc.nextFloat());
			System.out.print("Breadth	:	");
			rect.setBreadth(sc.nextFloat());
		}else {
			Circle c = (Circle) shape;	//Downcasting
			System.out.print("Radius	:	");
			c.setRadius(sc.nextFloat());
		}
		
		
	}
	private static void printRecord(Shape shape) {
		System.out.println("Area	:	"+shape.getArea());
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			Shape shape = null;
			switch( choice ) {
			case 1:
				shape = new Rectangle();	//Upcasting
				Program.acceptRecord( shape );
				shape.calculateArea();	//Dynamic method disptach
				Program.printRecord( shape );
				break;
			case 2:
				shape = new Circle();//Upcasting
				Program.acceptRecord( shape );
				shape.calculateArea();//Dynamic method disptach
				Program.printRecord( shape );
				break;
			}
		}
	}
}
