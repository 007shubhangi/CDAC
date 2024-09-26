
import com.sun.source.tree.ModifiersTree;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class Reflection_1{
    public static void main(String[] args) {
        Class<?> c=Thread.class;
        Field[] fields=c.getFields();
        for(Field field: fields){
            System.out.println(field.toString());
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getModifiers());
            String modifierName=Modifier.toString(field.getModifiers());
            System.out.println(modifierName);
    } 
        
    }
    public static void main3(String[] args) {
        Class<?> c=Integer.class;
        Package p =c.getPackage();
        System.out.println(p);//package java.lang
        System.out.println(c.getSimpleName());
        System.out.println(c.getSuperclass());
        System.out.println(c.getName());
    }
    public static void main2(String[] args) {
        Class<?> c=Thread.class;
        String name =c.getName();
        System.out.println(name);//java.lang.Thread
        String simplename=c.getSimpleName();
        System.out.println(simplename);//Thread
        System.out.println(c.getSuperclass());
        
    }
    public static void main1(String[] args) {
        Class<?> c=Thread.class;
        Package p =c.getPackage();
        System.out.println(p);//package java.lang
    }
}