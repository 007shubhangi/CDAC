interface Printable{
    void display(String s);
}
public class MethodRefStatic {
    public static void show(String s){
        System.out.println(s);
    }
    public void displayRecord(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        Printable p=MethodRefStatic::show;
        p.display("hiii");
    }
}
