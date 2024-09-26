//upperbound
//contain only Number che subtype i.e double,Integer,Short,Long,Float
//ArrayList<? extends Inter>
import java.util.ArrayList;

public class UpperBounder {
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
    public static void print(ArrayList<? extends Number>list){
        for (Object element : list) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> integerList=UpperBounder.getIntegerArrayList();
        UpperBounder.print(integerList);
        ArrayList<Double> doubleList=UpperBounder.getDoubleArrayList();
        UpperBounder.print(doubleList);
        // ArrayList<String> stringList=UpperBounder.getStringArrayList();
        // UpperBounder.print(stringList);
        // ArrayList<Boolean> booleanList=UpperBounder.getBooleanArrayList();
        // UpperBounder.print(booleanList);//Incompatible type
    }
}
