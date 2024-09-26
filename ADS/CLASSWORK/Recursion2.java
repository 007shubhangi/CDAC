public class Recursion2{
    static int i=0;
    public static void fun(){
        ++i;
        if(i<=5){
        System.out.println("vale of i :"+i);
        System.out.println("hellooo girls");
        fun();
        }

    }
    public static void main(String[] args) {
        fun();
    }
}