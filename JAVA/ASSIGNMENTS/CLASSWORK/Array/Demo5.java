
import java.util.Arrays;

public class Demo5 {
    public static void main(String args[]){
        Object []arr=new String[5];
        arr[0]="shubhangi";
        arr[1]=new String("rama");
        arr[2]=new StringBuffer("shewta");//ArrayStoreException
        System.out.print(Arrays.toString(arr));
    }
}
