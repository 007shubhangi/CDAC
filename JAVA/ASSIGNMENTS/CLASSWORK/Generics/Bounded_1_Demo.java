//bounded type parameter
class Box<N extends Number>{
    private N num;
    public Box(){}
    public void setNum(N num){
        this.num=num;
    }
    public N getNum(){
        return num;
    }

}
public class Bounded_1_Demo {
    public static void main(String args[]){
    Box<Integer> b=new Box<>();
    Box<Double> d=new Box<>();
    //Box<Character> c=new Box<>();//type argument Character is not within bounds of type-variable N
    //Box<Boolean> g=new Box<>();

    Box<Float> f=new Box<>();
    Box<Long> l=new Box<>();
    Box<Short> s=new Box<>();
    d.setNum(12.1542d);
    System.out.println(d.getNum());

    }
}
