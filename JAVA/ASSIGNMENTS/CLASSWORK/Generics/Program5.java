//Super class
class Base{
	private int num1 = 10;
	private int num2 = 20;
	
	public void printRecord( ) {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+this.num2);
	}
}
//Sub class
class Derived extends Base{
	private int num3 = 30;
	
	@Override
	public void printRecord() {
		super.printRecord();
		System.out.println("Num3	:	"+this.num3);
	}
}
public class Program5{	
	public static void main(String[] args) {
		Base base = new Base();	//OK
		
		Derived derived = (Derived) base;	//OK: Downcasting: ClassCastException
	
	}
	
	public static void main4(String[] args) {
		Base base = new Derived();	//Upcasting
		
		Derived derived = (Derived) base;	//OK: Downcasting
		
		base.printRecord();
		
		derived.printRecord();
	}
	
	public static void main3(String[] args) {
		Base base = null;
		
		Derived derived = (Derived) base;	//OK: Downcasting
		
		System.out.println( base );	//null
		
		System.out.println( derived );	//null
	}
	
	public static void main2(String[] args) {
		Derived derived = new Derived();	//OK
		
		//Base base = ( Base )derived;	//OK: Upcasting
		
		Base base = derived;	//OK: Upcasting
		
		base.printRecord();
		
		derived.printRecord();
	}
	public static void main1(String[] args) {
		Derived derived = null;	//OK
		
		//Base base = ( Base )derived;	//OK: Upcasting
		
		Base base = derived;	//OK: Upcasting
		
		System.out.println( base );	//null
		
		System.out.println( derived );	//null
	}
}
