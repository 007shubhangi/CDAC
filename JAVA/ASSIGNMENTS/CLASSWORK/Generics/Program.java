

public class Program {
	public static void main(String[] args) {
		int n1 = 10;	//OK
		
		//int n2 = new int( 10 );	//Not OK
		
		Integer n3 = 10;	//Integer n3 = Integer.valueOf(10)	//OK
		
		Integer n4 = new Integer( 10 );
	}
	
	public static void main8(String[] args) {
		long number = 10;
		
		Long l1 = new Long(number);	//OK
		
		Number l2 = new Long(number);	//OK: Upcasting
		
		Object l3 = new Long(number);	//OK: Upcasting
		
	}
	
	public static void main7(String[] args) {
		double number = 10.1d;
		
		Double d1 = new Double(number);	//OK
		
		Number d2 = new Double(number);	//OK: Upcasting
		
		Object d3 = new Double(number);	//OK: Upcasting
	}
	
	public static void main6(String[] args) {
		float number = 10.1f;
		
		Float f1 = new Float(number);	//OK
		
		Number f2 = new Float(number);	//OK: Upcasting
		
		Object f3 = new Float(number);	//OK: Upcasting
	}
	
	public static void main5(String[] args) {
		int number = 10;
		
		Integer i1 = new Integer(number);	//OK
		
		Number i2 = new Integer(number);	//OK: Upcasting
		
		Object i3 = new Integer(number);	//OK: Upcasting
	}
	
	public static void main4(String[] args) {
		short number = 10;
		
		Short sh1 = new Short(number);	//OK
		
		Number sh2 = new Short(number);	//OK: Upcasting
		
		Object sh3 = new Short(number);	//OK: Upcasting
	}
	
	public static void main3(String[] args) {
		byte bs = 10;
		Byte b1 = new Byte( bs);	//OK
		
		Number b2 = new Byte( bs);	//OK: Upcasting
		
		Object b3 = new Byte( bs);	//OK: Upcasting
	}
	
	public static void main2(String[] args) {
		Character ch1 = new Character('A');	//OK
		//Number ch2 = new Character('A');	//Not OK
		Object ch2 = new Character('A');	//OK: Upcasting
	}
	
	public static void main1(String[] args) {
		Boolean b1 = new Boolean(true);//OK
		//Number b1 = new Boolean(true);	//Not OK
		Object b2 = new Boolean(true);	//OK: Upcasting
	}
}
