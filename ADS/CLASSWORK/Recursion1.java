public class Recursion1{
    static int i=0;
    public static void fun(){
        ++i;
        System.out.println("vale of i :"+i);
        fun();

    }
    public static void main(String[] args) {
        fun();
    }
}
