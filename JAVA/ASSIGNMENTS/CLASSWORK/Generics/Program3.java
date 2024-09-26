//Super class
class Base{
	private int num1 = 10;
	private int num2 = 20;
	
	public int getNum1() {
		return this.num1;
	}
	public int getNum2() {
		return this.num2;
	}
}
//Sub class
class Derived extends Base{
	private int num3 = 30;
	public int getNum3() {
		return this.num3;
	}
}
public class Program3{
	public static void main(String[] args) {
		Base base = new Derived();	//Upcasting
		System.out.println("Num1	:	"+base.getNum1());	//OK
		System.out.println("Num2	:	"+base.getNum2());	//OK
		//System.out.println("Num2	:	"+base.getNum3());	//Not OK
		
		Derived derived = (Derived) base;	//Downcasting: OK
		System.out.println("Num3	:	"+derived.getNum3());	//OK
	}
	public static void main2(String[] args) {
		Derived derived = new Derived();
		System.out.println("Num1	:	"+derived.getNum1());	//OK
		System.out.println("Num2	:	"+derived.getNum2());	//OK
		System.out.println("Num3	:	"+derived.getNum3());	//OK
	}
	
	public static void main1(String[] args) {
		Base base = new Base();
		System.out.println("Num1	:	"+base.getNum1());	//OK
		System.out.println("Num2	:	"+base.getNum2());	//OK
		//System.out.println("Num3	:	"+base.getNum3());	//Nok OK
	}
}

