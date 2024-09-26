
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsoleInput {
    public static void main(String[] args) throws  IOException {
        //InputStream, BufferedReader
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        System.out.println("enter double no");
        double dval=Double.parseDouble(br.readLine());//String to double
        System.out.println("dval: "+ dval);

        System.out.println("enter int no");
        int ival=Integer.parseInt(br.readLine());//String to int
        System.out.println("dval: "+ ival); 
        
        System.out.println("enter string");
        String str=(br.readLine());//String 
        System.out.println("string val : "+ str);

    }
}
