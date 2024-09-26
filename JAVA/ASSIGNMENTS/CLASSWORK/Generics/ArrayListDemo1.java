
import java.util.ArrayList;

//Arraylist Demo

public class ArrayListDemo1{
   public static void main(String[] args) {
      ArrayList<Integer> arr=new ArrayList<>();
      arr.add(10);
      arr.add(20);
      arr.add(30);
      arr.add(40);
      arr.add(10);

      //to print
      for (Integer element : arr) {
         System.out.println(element);
      }
   }
}
