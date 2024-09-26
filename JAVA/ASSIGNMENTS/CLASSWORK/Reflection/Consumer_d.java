
import java.util.function.Consumer;

public class Consumer_d{
    public static void main(String[] args) {
    //     Consumer<Integer> c=number->System.out.println(number);
    //     c.accept(100);
         Consumer<String> str1=(String str) -> System.out.println(str);
         str1.accept("helooooooo");

         Consumer<Integer> num=(Integer number) -> System.out.println(number);
         num.accept(1000);
    }
}