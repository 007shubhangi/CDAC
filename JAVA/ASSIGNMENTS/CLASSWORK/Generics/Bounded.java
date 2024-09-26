//bounded type related to integer
class Box <N extends Number>{
     private N object;
     public N getobject(){
        return this.object;
     }
     public void setobject(N object){
        this.object=object;
     }
}
public class Bounded{
    public static void main(String[] args) {
        Box<Number> b1=new Box<>();//OK
        b1.setobject(100);
        Number object= b1.getobject();
        System.out.println(object);

        Box<Double> b2=new Box<>();//OK
        b2.setobject(12.3365d);
        Double d=b2.getobject();
        System.out.println(d);

        //Box<Boolean> b3=new Box<>(); not ok
       // Box<Char> b3=new Box<>();//Cannot infer type arguments for Box<>
        Box<Float> b3=new Box<>();//OK



    }
}
