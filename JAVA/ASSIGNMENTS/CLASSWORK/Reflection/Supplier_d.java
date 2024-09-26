
import java.util.Random;
import java.util.function.Supplier;

public class Supplier_d {
   public static void main(String[] args) {
    Supplier<Integer> s= ( )-> 10;
    int num=s.get();
    System.out.println(num);

//     Supplier<Integer> s= ( )-> new Random().nextInt();
//     int num=s.get();
//     System.out.println(num);
   
}
}
