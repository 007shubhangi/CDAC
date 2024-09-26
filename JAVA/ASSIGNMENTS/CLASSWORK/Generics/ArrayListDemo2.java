
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo2{
    private  static ArrayList<Integer> getIntegerArrayList(){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        return arr;
    }
    private static ArrayList<Double> getDoubleArrayList(){
        ArrayList <Double> arr=new ArrayList<Double>();
        arr.add(102.5d);
        arr.add(12.55d);
        arr.add(12.5d);
        return arr;
    }
    private static ArrayList<Float> getFloatList(){
        ArrayList <Float> arr=new ArrayList<Float>();
            arr.add(10.2f);
            arr.add(12.6f);
            return arr;
        }
    private static ArrayList<String> getStringArrayList(){
        ArrayList<String> arr=new ArrayList<>();
        arr.add("cdac");
        arr.add("null");
        arr.add("DBDA");
        return arr;
    } 
    public static void printRecord(ArrayList<?> arr){
        for (Object elem : arr) {
            System.out.println(elem);
        }
    }   
    
    public static void main(String[] args) {
       	
		ArrayList<Integer> integerList = ArrayListDemo2.getIntegerArrayList( );
		ArrayListDemo2.printRecord( integerList );
		
		ArrayList<Double> doubleList = ArrayListDemo2.getDoubleArrayList( );
		ArrayListDemo2.printRecord( doubleList );
		
		ArrayList<String> stringList = ArrayListDemo2.getStringArrayList( );
		ArrayListDemo2.printRecord( stringList );

    
      
    }
}
