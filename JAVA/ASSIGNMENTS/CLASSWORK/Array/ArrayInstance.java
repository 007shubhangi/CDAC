
import java.util.Arrays;

class Complex{
    int real;
    int img;
}
public class ArrayInstance {
    public static void main(String[] args) {
        Complex[] arr=new Complex[3];
        for(Complex ele:arr){
            System.out.println(ele);
        }
        arr[0]=new Complex();
        arr[1]=new Complex();
        arr[2]=new Complex();
        System.out.println(Arrays.toString(arr));

    }
}
