
class A{
	int num1 = 10;
	int num3 = 30;
}
class B extends A{
	int num2 = 20;
	int num3 = 40;
	
	public void print( ) {
		System.out.println("Num1	:	"+this.num1);	//10
		System.out.println("Num2	:	"+this.num2);	//20
		
		System.out.println("Num3	:	"+super.num3);	//30
		System.out.println("Num3	:	"+this.num3);	//40
	}
}
public class Program7 {
	public static void main(String[] args) {
		B b = new B( );
		b.print();
	}
}
