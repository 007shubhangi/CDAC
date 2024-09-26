import java.util.*;
import java.util.function.Predicate;

public class Predicate_d{
    public static void main(String[] args) {
    //Predicate<T t>  boolean test(T t)
       Predicate<Integer> p=number->number%2==0;
       int number=10;
       boolean result=p.test(number);
       System.out.println(result);
    }
}
