

class Person{
     String name;
     String addr;

     public Person(){
        this.name="";
        this.addr="ngr";
     }

    void setName(String str){
        this.name=str;
    }
    void setAddr(String adr){
        this.addr=addr;
    }
    public String getName(){
      return  this.name;
    }
    String getAddr(){
        return this.addr;
    }
     public void printRecord(){
        System.out.println(this.name);
        System.out.println(this.addr);
     }
}
class Emp extends Person{
  
}
public class Program6 {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("shubhangi");
        p1.setAddr("mh16");
        p1.printRecord();

        Emp e1=new Emp();
        e1.setName("prath");
        e1.printRecord();
        //System.out.println(e1.name);

    }
}
