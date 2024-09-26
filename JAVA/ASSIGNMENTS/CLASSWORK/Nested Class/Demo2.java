class Outer{
    int number=74;
    static final int num1=10;
   
    class Inner{
       private static int num2=40;
        public void print(){
            //final static int num3=80; //not ok 
            //we cant define feild static inside nonstatic methos
            System.out.println("num :"+ Outer.num1);
            System.out.println("num :"+ Inner.num2);
            System.out.println(num1);//ok
            System.out.println(number);//ok

        }
    }
   

}

class Nested_Demo2{
    public static void main(String[] args) {
        Outer.Inner in=new Outer().new Inner();
        in.print();
    }
}
