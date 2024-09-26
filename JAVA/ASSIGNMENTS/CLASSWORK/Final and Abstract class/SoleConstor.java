//sole ctor
abstract class Base{
	private int num1;
	private int num2;
	public Base(int num1, int num2) {	//Sole Constructor
		this.num1 = num1;
		this.num2 = num2;
	}
	public void printRecord( ) {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+this.num2);
	}
}
class Derived extends Base{
	private int num3;
	public Derived( int num1, int num2, int num3 ) {
		super( num1, num2 );
		this.num3 = num3;
	}
	public void printRecord( ) {
		super.printRecord();
		System.out.println("Num3	:	"+this.num3);
	}
}
public class SoleConstor {
	public static void main(String[] args) {
		Derived derived = new  Derived(10, 20, 30);
		derived.printRecord();
	}
}

