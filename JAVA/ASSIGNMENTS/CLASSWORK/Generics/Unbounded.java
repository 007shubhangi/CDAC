
import java.util.*;

public class Unbounded {
    public static ArrayList<Integer> getIntegrArrayList( ){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        return list;
    }
    public static ArrayList<Double> getDoubleArrayList( ){
        ArrayList<Double> list=new ArrayList<>();
        list.add(10.5d);
        list.add(11.5d);
        return list;
    }
    public static ArrayList<Float> getFloatArrayList( ){
        ArrayList<Float> list=new ArrayList<>();
        list.add(11.2f);
        list.add(6.5f);
        return list;
    }
    public static void printRecord(ArrayList<?> list){
        for(Object element: list){
        System.out.println(element);
    }
    }
    public static void main(String[] args) {
        ArrayList<Integer> integerlist=Unbounded.getIntegrArrayList();
        Unbounded.printRecord(integerlist);

        ArrayList<Double> doublelist=Unbounded.getDoubleArrayList();
        Unbounded.printRecord(doublelist);
       
        ArrayList<Float> floatlist=Unbounded.getFloatArrayList();
        Unbounded.printRecord(floatlist);
    }
}
