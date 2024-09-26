//Upcasting Downcasting
//narrowing widening
public class UpcastingDowncasting {
	public static void main(String[] args) {
		Object obj = new String("CDAC");	//Upcasting
		String str = (String) obj;	//Downcasting
	}
	public static void main7(String[] args) {
		String str = new String("CDAC");
		//Object object = ( Object )str;	//Upcasting
		Object object = str;	//Upcasting
	}
	public static void main6(String[] args) {
		Integer i = new Integer(10);
		int number = i;	//Auto-Unboxing
		//int number = i.intValue();
		System.out.println("Number	:	"+number);
	}
	public static void main5(String[] args) {
		int number = 10;
		Integer i = number;	//Auto-Boxing
		//Integer i = Integer.valueOf(number);
		System.out.println( i.toString());
	}
	public static void main4(String[] args) {
		String str = "123";
		int number = Integer.parseInt(str);	//UnBoxing
		System.out.println("Number	:	"+number);
	}
	public static void main3(String[] args) {
		int number = 10;
		
		String str1 = String.valueOf(number);	//Boxing
		System.out.println(str1);
		
		String str2 = Integer.toString(number);	//Boxing
		System.out.println(str2);
	}
	public static void main2(String[] args) {
		double num1 = 10.5d;
		int num2 = ( int )num1;	//Narrowing
	}
	public static void main1(String[] args) {
		int num1 = 10;
		//double num2 = ( double )num1;	//Widening: OK
		double num2 = num1;	//Widening: OK
	}
}