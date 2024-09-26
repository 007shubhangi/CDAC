
//Super class
class Base{
	int num1 = 10;
	int num2 = 20;
}
//Sub class
class Derived extends Base{
	int num3 = 30;
}
public class Program2{
	public static void main(String[] args) {
		/* Derived derived  = new Derived();	//OK
		Base base = ( Base )derived;	//OK: Upcasting */
		
		Base base = new Derived();	//Upcasting
		System.out.println("Num1	:	"+base.num1);	//OK
		System.out.println("Num2	:	"+base.num2);	//OK
		//System.out.println("Num3	:	"+base.num3);	//Not OK
		
		Derived derived = (Derived) base;	//Downcasting: OK
		System.out.println("Num3	:	"+derived.num3);	//OK
	}
	public static void main2(String[] args) {
		Derived derived = new Derived();
		System.out.println("Num1	:	"+derived.num1);	//OK
		System.out.println("Num2	:	"+derived.num2);	//OK
		System.out.println("Num3	:	"+derived.num3);	//OK
	}
	public static void main1(String[] args) {
		Base base = new Base();
		System.out.println("Num1	:	"+base.num1);	//OK
		System.out.println("Num2	:	"+base.num2);	//OK
		//System.out.println("Num3	:	"+base.num3);	//Not OK
	}
}
