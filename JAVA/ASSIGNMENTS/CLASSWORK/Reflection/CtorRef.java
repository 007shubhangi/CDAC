class Employee{
    String name;
    int id;
    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
     public String getName(){
       return this.name;
      }
    public int getId(){
        return this.id;
     }
      public String toString(){
         return this.name+"   "+this.id;
      }
 }
 interface  Sample{
     Employee get(String name,int id);
 }
 public class CtorRef {
     public static void main(String[] args) {
        Sample s1=Employee::new;
        Employee emp=s1.get("poja", 100);
        System.out.println(emp.toString());
 
     }
 }

