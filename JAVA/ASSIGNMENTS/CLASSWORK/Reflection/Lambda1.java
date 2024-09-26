import java.util.*;
interface Printable{//functional class
    void print(String str);//SAM Funtion Discriptor//functional methd
}
public class Lambda1{
    public static void main(String[] args) {
        Printable p1= str ->System.out.println(str);
        // Printable p1=(String s)->System.out.println(s);
         p1.print("helloo world!!!!!");   
    }
    /* 
    public static void main1(String[] args) {
        Printable p=() -> System.out.println("hello world");
        p.print();
    }
    */
}