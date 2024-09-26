
import java.lang.reflect.Field;
import java.nio.file.Files;

class Complex{
    private int real;
    private int img;
    public int getReal(){
        return this.real;
    }
    public int getImg(){
        return this.img;
    }
}
public class PrivateFieldByReflection {
    public static void main(String[] args) {
        Complex c1=new Complex();
        System.out.println(c1.getImg());
        System.out.println(c1.getImg());

        Class<?> complex=c1.getClass();
        Field field=null;
        try {
            field = complex.getDeclaredField("real");
            field.setAccessible(true);
            field.setInt(c1, 1000);

            field = complex.getDeclaredField("img");
            field.setAccessible(true);
            field.setInt(c1, 54);

            System.out.println("Real "+c1.getReal());
            System.out.println("img "+c1.getImg());
    

        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}
