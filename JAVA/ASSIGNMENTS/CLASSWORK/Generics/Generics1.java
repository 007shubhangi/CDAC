//Generics
class Box{
    private Object num;
    public void setNum(Object num){
        this.num=num;
    }
    public Object getNum(){
        return this.num;
    }
}
public class Generics1 {
    public static void main(String[] args) {
        Box b1=new Box();
        System.out.println(b1.getNum());
    }
} 
