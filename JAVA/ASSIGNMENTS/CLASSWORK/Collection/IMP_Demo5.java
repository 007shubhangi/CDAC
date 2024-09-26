import java.util.*;
class Employee{
  private int empid;
  private String name;
  private float salary;

  public Employee(int){}
  public Employee(int empid,String name,float salary){
   this.empid=empid;
   this.name=name;
   this.salary=salary;
}
  public String toString(){
    return this.empid+" "+this.name+" "+this.salary;
  }
}
class emputil{
    public static ArrayList<Employee> arr1=new ArrayList<>();
    public static void addrecord(Employee[]emp){
        for(Employee e:arr1){
           arr1.add(e);
        }
    }
    static Scanner sc=new Scanner(System.in);
    public static int menulist(){
        System.out.println("0.exit");
        System.out.println("1.accept");
        System.out.println("2.print");
        System.out.println("3.remove");
        System.out.println("4.enter again");
        int choice=sc.nextInt();
        return choice;
    }

}
public class IMP_Demo5 {
    public static Employee[] getEmployee(){
        Employee[] e1=new Employee[](5);
        e1[0]=new Employee(100,"ram",9555658.5f);
        e1[1]=new Employee(170,"rugcam",56442258.5f);
        e1[2]= new Employee(1078,"hggfdram",445658.5f);
        e1[3]=new Employee(45600,"gcfdhhram",56258.5f);
        return e1;
    }
    public static void main(String[] args) {
        emputil e1=new emputil();
        int choice;
        while((choice=emputil.menulist())!=0){
            switch (choice) {
                case 1:
                    e1.addrecord(IMP_Demo5.getArray());
                    break;

                case 2:
                    
                break; 

                case 3:
                    
                break;

                default:
                    throw new AssertionError();
            }
        }
    }
}
