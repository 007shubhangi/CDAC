import java.lang.reflect.Field;

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
public class Program {
    public static void main(String[] args) { 
        Complex complex=new Complex();
        System.out.println(complex.getImg());
        System.out.println(complex.getReal());

        Class<?> c1=complex.getClass();
        Field field=null;
        try {
            field=c1.getDeclaredField("real");
            field.setAccessible(true);
            field.setInt(c1, 4155);

            field=c1.getDeclaredField("img");
            field.setAccessible(true);
            field.setInt(c1,2564);

            System.out.println(complex.getReal());
            System.out.println(complex.getImg());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
