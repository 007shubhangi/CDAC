
//Comparator
//Comparator
import java.util.*;
class EmpUtil implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
    return e1.getAge()- e2.getAge();
    }
}
class EmpUtil1 implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
    return e1.getEmpid()-(e2.getEmpid());
    }
}
class EmpUtil2 implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
    return e1.getName().compareTo(e2.getName());
    }
}
class Employee implements Comparable<Employee>{
    private int empid;
    private String name;
    private int age;

    public Employee(){}
    public Employee(int empid, String name,int age){
        this.empid=empid;
        this.name=name;
        this.age=age;
    }
    public int getEmpid(){
        return empid;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setEmpid(int empid){
        this.empid=empid;
    }
    public String toString(){
        return String.format("%-10d%-20s%-10d",this.empid,this.name,this.age);
    }
    public int compareTo(Employee Other){
        //return this.empid-Other.empid;
        return this.name.compareTo(Other.name);
    }
}
class ComparatorDemo_1 {
    private static Scanner sc=new Scanner(System.in);
    private static Employee[] getIntegerArray(){
        Employee[] arr=new Employee[4];
        arr[0]=new Employee(177801,"rama",12);
        arr[1]=new Employee(54865,"juhu",56);
        arr[2]=new Employee(542222,"seema",88);
        arr[3]=new Employee(58964,"ganu",64);
        return arr;
    }
    private static void print(Employee[]emp){
      for(Employee element :emp){
        System.out.println(element);
      }
    }
    public static int menulist(){
        System.out.println("0.exit");
        System.out.println("1.compare by name");
        System.out.println("2.compare by age");
        System.out.println("3.compare by empid");
        System.out.println("enter choice");
        int choice= sc.nextInt();
        return choice;
    }
    public static void releaseResource(){
        sc.close();
    }
    public static void main(String args[]){
        int choice;
        Employee[] emp=ComparatorDemo_1.getIntegerArray();
        // Program.print(emp);
        // System.out.println("******************************");
        // //Arrays.sort(emp);
        // Arrays.sort(emp);
        // Program.print(emp);
        // System.out.println("******************************");

        // Comparator<Employee> comparator=new EmpUtil ();
        // Arrays.sort(emp,comparator);
        // Program.print(emp);

        Comparator<Employee>cmp=null;
        while((choice=ComparatorDemo_1.menulist())!=0){
            switch (choice) {
                case 1:
                   cmp=new EmpUtil2(); 
                    break;
                case 2:
                   cmp=new EmpUtil(); 
                    break;
                case 3:
                   cmp=new EmpUtil1(); 
                    break;    
            }
            Arrays.sort(emp,cmp);
            ComparatorDemo_1.print(emp);
        }
    }
}

