interface  A{
    void F1();
    //pUblic abstract void F1();
    void F3();
}
interface B{
    void F2();
    void F3();
}
abstract class Test{
    abstract void F3();
}

class C extends Test implements A,B{
    public void F1(){
        System.out.println("C: F1");
    }
    public void F2(){
        System.out.println("C: F2");
    }
    public void F3(){
        System.out.println("C: F3");
    }
    
}
public class MultipleInterface {
    public static void main(String[] args) {
        A a=new C();//UPCASTING
        a.F1();
        a.F3();

        B b=new C();
        b.F2();
        System.out.println("************");
        b.F3();
        a.F3();

         Test t=new C();
         t.F3();

    }
}
