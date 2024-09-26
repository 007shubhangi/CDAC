import java.util.function.Function;

public class Function_d {
    public static void main(String[] args) {
        //Function<T t> R apply(Tt )
        Function<String,Integer> fun= (String str)-> str.length();
        Integer length=fun.apply("shubhangi");
        System.out.println(length);
    }
}
