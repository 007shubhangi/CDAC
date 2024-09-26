//constructor
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

public class Reflection_3 {
    public static void main(String[] args) {
        Class<?> c=Thread.class;
        Constructor[]ctor=c.getConstructors();
        for(Constructor constructor:ctor)
        {
            System.out.println(constructor.toString());
            System.out.println(constructor.getName());

            Parameter[] param=constructor.getParameters();
            for(Parameter paramter:param){
                String name=paramter.getName();
                String paratype=paramter.getType().getSimpleName();
                System.out.println(name+" "+paratype);
            }
            System.out.println("***");
        }

    }
}
