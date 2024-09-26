class Employee{
    String name;
    int empid;
    float salary;

    public Employee(String name,int empid,float salary){
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }
    public Employee(){}
    public String toString(){
        return String.format("%-10s%-5d%-20f", this.name,this.empid,this.salary);
    }
}
public class ArrayNonPrimitive {
    public static Employee[] getArray(){
        Employee[] emp=new Employee[3];
        emp[0]=new Employee("shubh", 1002, 1002.4f);
        emp[1]=new Employee("prath", 1402, 7402.4f);
        emp[2]=new Employee("raj", 452, 87922.4f);
        return emp;
    }
    private static void print(Employee[]arr ){
        for(Employee emp: arr){
            System.out.println(emp.toString());
        }
    }
    public static void main(String[] args) {
        // Employee e1=new Employee(null, 0, 0);
        // System.out.println(e1.toString());
       
        Employee[] emp=ArrayNonPrimitive.getArray();
        ArrayNonPrimitive.print(emp);
        //to sort
        //Arrays.sort(emp);
;    

    }
}
