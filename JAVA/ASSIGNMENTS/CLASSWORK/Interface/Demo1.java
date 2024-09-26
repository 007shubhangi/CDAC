interface Top{}
interface Bottom{   
  //int num;//The blank final field num may not have been initialized
    int num=10; 
    public int num1=100;
    static int num2=44;
    //public Bottom(){} //not ok constructpr not allow
    //void print(){} //not ok interface abstract methods cannot have body
    public void print();
    public static void print1(){

    }
    public static void print3(){

    }
    // public void print1(){ //not ok
    // }
}
class Up implements Bottom{
    public void print(){
        System.out.println(num1);
        System.out.println(Bottom.num2);
    };

}
public class Demo1{
    public static void main(String args[]){
        //Top t=new Top();//no instance only reference
        Up u1=new Up();
        u1.print();//100 44

        Bottom b=u1;
        b.print();//100 44

    }
}