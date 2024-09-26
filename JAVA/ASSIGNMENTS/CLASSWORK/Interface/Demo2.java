interface A{
    int num1=10;
    int num4=100;
    int num5=70;
}
interface B{
    int num2=20;
    int num4=40;
    int num5=700;

}
interface C extends A,B{
    int num3=30;
    int num4=50;
}
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(A.num5);//70
        System.out.println(B.num5);//700
        System.out.println(C.num5);//AMBIGUTY ERROR
    }

    public static void main2(String[] args) {
        System.out.println(A.num4);//100
        System.out.println(B.num4);//40
        System.out.println(C.num4);//50

    }
    public static void main1(String[] args) {
        System.out.println(A.num1);
        System.out.println(C.num1);
        System.out.println(B.num2);
        System.out.println(C.num2);
        System.out.println(C.num3);
    }
}
