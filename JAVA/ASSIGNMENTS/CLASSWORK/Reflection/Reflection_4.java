
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import jdk.jshell.MethodSnippet;

public class Reflection_4 {

    public static void main(String[] args) {
        Class<?> c4=Thread.class;
        Method[] m1=c4.getMethods();
        for(Method methods:m1){
           String name=methods.getName();
           System.out.println(name.toString()); 
        }
    }

    public static void main3(String[] args) {
        Class<?> c3=Thread.class;
        Method[] method2=c3.getDeclaredMethods();
        for(Method methods:method2){
            System.out.println(methods.toString());
        }    
    }
    
    public static void main2(String[] args) {
        Class<?> c1=Thread.class;
        Method[] method1=c1.getMethods();
        for(Method methods:method1){
            
            Parameter[] para=methods.getParameters();
            for(Parameter params:para){
                System.out.println(params.toString());
            }
        }
    }
    public static void main1(String[] args) {
        Class<?> c=Thread.class;
        Method[]arr=c.getMethods();
        for(Method method:arr){
            System.out.println(method.toString());
        }

    }
}
