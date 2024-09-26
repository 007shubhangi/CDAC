
import java.util.ArrayList;
import java.util.Date;

//Parameterized Type
class Box<T>{	//T: Type Parameter
	private T object;

	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
}

public class Program7{
	
	public static void main3(String[] args) {
		//Box<int> box = new Box<int>( );	//NOT OK
		
		//Box<Integer> box = new Box<Integer>( );	//OK
		
		Box<Integer> box = new Box<>( );	//OK
		
		//Box<Object> box = new Box<>( );
	}
	
	public static void main2(String[] args) {
		Box<Date> b1 = new Box<Date>();	//OK
		
		Box<Date> b2 = new Box< >();	//OK: Type inference
		
		//Box<> b3 = new Box<Date>();	//Not OK
		
		//Box<> b4 = new Box<>();	//Not OK
		
		//Box<Date> b5 = new Box<Object>();	//Not OK
		
		//Box<Object> b6 = new Box<Date>();	//Not OK
		
		Box box = new Box();//Raw Type
		//Box<Object> box = new Box<Object>();
	}
	
	public static void main1(String[] args) {
		Box<Date> box = new Box<Date>();	//Date: Type argument
		
		Date date = new Date();
		box.setObject(date);
		
		//String str =  box.getObject(); //Not OK
		Date dt = box.getObject();
		System.out.println( dt.toString());
	}
}

