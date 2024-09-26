import java.util.*;
public class Demo4{
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println(arr.isEmpty());

        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println(arr.isEmpty());
        for(Integer ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");

        System.out.println(arr.get(2));
        System.out.println(arr.size());
        //System.out.println(arr.get(arr.size()));//java.lang.IndexOutOfBoundsException

        String str="shubhangi";
        System.out.println(str);
        System.out.println(str.charAt(0));
        //System.out.println(str.charAt(9));//StringIndexOutOfBoundsException
        System.out.println(str.length());

        arr.forEach(System.out::print);
    }
}