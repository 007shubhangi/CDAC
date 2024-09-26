
import java.awt.geom.Area;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.ArrayList;
import java.util.*;


public class Emp implements Comparable<Emp>{
    private String name;
    private String add;
    private int empid;
    private int salary;
    public Emp(String name,String add,int empid,int salary){
        this.name=name;
        this.add=add;
        this.empid=empid;
        this.salary=salary;
    }
    public int compareTo(Emp That){
         return this.empid-That.empid;
    }

    public String toString(){
        return this.name+" "+this.add+" "+this.empid+" "+this.salary;
    }

    public static void main(String[] args) {
      //Array of type emp
        Emp[] arr=new Emp[3];
        arr[0]=new Emp("Ram","pune",1001,2780);
        arr[1]=new Emp("sham","Nagar",1071,2099);
        arr[2]=new Emp("reeam","bombay",1801,2700);
        
    }
}
