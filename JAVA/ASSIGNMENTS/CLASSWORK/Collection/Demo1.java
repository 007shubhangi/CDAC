
import com.sun.tools.javac.Main;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo1{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(5);
        arr.add(10);
        arr.add(20);
        arr.add(25);
        arr.add(9);

        // for(Integer ele:arr){
        //     System.out.print(ele+" ");
        // }

        System.out.print(arr.toString());
        System.out.println(" ");

        for(int index=0;index<arr.size();index++){
            int element=arr.get(index);
            System.out.print(element +" " );
        }
        System.out.println(" ");

        List<Integer> list=new ArrayList<>();//upcasting
    
        List<String> str=new ArrayList<>();
        str.add("hii");
        str.add("null");
        System.out.println(str.toString());

        List<String> str1=new LinkedList<>();

    }
}