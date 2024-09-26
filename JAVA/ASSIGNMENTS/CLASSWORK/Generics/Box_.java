import java.util.Date;
class Box{
	private Object object;
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}

public class Box_ {
	public static void main(String[] args) {
		Box box = new Box();
		Date date = new Date();
		box.setObject(date);
		
		Object object = box.getObject();
		//String str = (String) object; //ClassCastException
		Date dt = (Date) object; //OK
		System.out.println( dt );
	}
	public static void main3(String[] args) {
		Box box = new Box();
		Date date = new Date();
		box.setObject(date);
		
		Object object = box.getObject();
		Date dt  = (Date) object;	//Downcasting
		System.out.println( dt.toString());//Sat Sep 14 10:16:53 IST 2024
	}
	public static void main2(String[] args) {
		Box box = new Box();
		int number = 125;
		box.setObject( number );	//box.setObject( Integer.valueOf(number) );
		
		Object object = box.getObject();
		Integer integer = (Integer) object;	//Downcasting
		number = integer.intValue();	//UnBoxing
		System.out.println("Number	:	"+number);
		
	}
	public static void main1(String[] args) {
		Box box = new Box( );
	}
}

