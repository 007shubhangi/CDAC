interface Printable{
    void display(String s);//functional method //SAM
}
public class MethodRefNonStatic {
    public static void show(String str){
        System.out.println(str);
    }
    public void displayRecord(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        MethodRefNonStatic m=new MethodRefNonStatic();
        Printable p= m::displayRecord;
        p.display("hello dac");
    }
}
