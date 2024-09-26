
class Hash<K,V>{
    private K name;
    private V value;
    public Hash(K name,V value){
        this.name=name;
        this.value=value;
    }
    public void print(){
        System.out.println("name :  "+name);
        System.out.println("value   :  "+value);
    }
}
public class Program8 {
    public static void main(String[] args) {
        Hash<Integer ,String> h=new Hash<>("a",10);
        h.print();
    }
}
