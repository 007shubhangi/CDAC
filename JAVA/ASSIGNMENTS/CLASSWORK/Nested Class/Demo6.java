class Outer{
    int num=10;
    static int number=1000;
     static class Inner{
         private final static int num=20;
         public void print(){
            int num=40;
            System.out.println("num: "+num);//40
            System.out.println("num: "+Inner.num);//20
            Outer out=new Outer();
            System.out.println("num: "+out.num);//10
            System.out.println("num: "+Outer.number);//1000
         }
    }
}
class Demo6{
    public static void main(String[] args) {
       // for static inner classs
        Outer.Inner in=new Outer.Inner();//ok
        in.print();

        //for nonstatic nested
        // Outer.Inner n=new Outer().new Inner(); 
        // n.print();


    }
}