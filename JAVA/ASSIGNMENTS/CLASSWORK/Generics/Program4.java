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
public class Program4{	
	public static void main(String[] args) {
		Base base = new Derived();	//Upcasting
		base.printRecord();
	}
	public static void main2(String[] args) {
		Derived derived = new Derived();
		derived.printRecord();
	}
	public static void main1(String[] args) {
		Base base = new Base();
		base.printRecord();	
	}
}

