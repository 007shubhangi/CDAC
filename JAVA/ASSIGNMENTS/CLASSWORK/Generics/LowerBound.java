
import java.util.ArrayList;

//Lower bound super keyword use 
//contain only Integer che super i.e NUMBER AND OBJECT
//ArrayList<? super Inter>
public class LowerBound {
    public static ArrayList<Integer>  getIntegerArrayList(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        return list;
    }
    public static ArrayList<Double>  getDoubleArrayList(){
        ArrayList<Double> list=new ArrayList<>();
        list.add(10.225d);
        return list;
    }
    public static ArrayList<String>  getStringArrayList(){
        ArrayList<String> list=new ArrayList<>();
        list.add("hii");
        return list;
    }
    public static ArrayList<Boolean> getBooleanArrayList(){
        ArrayList<Boolean> list=new ArrayList<>();
        list.add(true);
        return list;
    }
    public static ArrayList<Number> getNumberArrayList(){
        ArrayList<Number> list=new ArrayList<>();
        list.add(10);
        return list;
    }
    public static void print(ArrayList<? super  Number>list){
        for (Object element : list) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        ArrayList<Number> arr=LowerBound.getNumberArrayList();
        LowerBound.print(arr);
        // ArrayList<Integer> integerList=LowerBound.getIntegerArrayList();
        // LowerBound.print(integerList);
        // ArrayList<Double> doubleList=LowerBound.getDoubleArrayList();
        // LowerBound.print(doubleList);
    }
}
