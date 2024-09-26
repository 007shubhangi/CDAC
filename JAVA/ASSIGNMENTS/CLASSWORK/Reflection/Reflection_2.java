
import java.lang.reflect.Field;

class Complex{
    private int real;
    public int img;
     protected int real2;

}
public class Reflection_2 {
    public static void main(String[] args) {
        Class<?>c=Complex.class;
        Field[] field=c.getFields();
        for(Field fields:field){
            System.out.println(fields);//only public fiels of declare class
        }

        // Field[] field=c.getDeclaredFields();
        // for(Field fields:field){
        //     System.out.println(fields);
        // }
    }
}
