import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparyByName implements Comparator<Students>{
    public int compare(Students s1,Students s2){
        return s1.name.compareTo(s2.name);
    }
}
class ComparyBySalary implements Comparator<Students>{
    public int compare(Students s1,Students s2){
        return (int)(s1.salary - s2.salary);
    }
}
class Students implements Comparable<Students>{
     int id;
     String name;
     float salary;

     Students(){}

     Students(int id,String name,float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public int compareTo(Students s1){
        return this.id-s1.id;
    }
    public String toString(){
        return this.id+" "+this.name+" "+this.salary;
      }
}
public class Comparator1 {
    public static void display( List<Students> list){
        if(list==null) return;
        for(Students s1:list){
            System.out.println(s1);
        }
    }
    public static void main(String[] args) {
        List<Students> list=new ArrayList<>();
        Students s1=new Students(10,"shubhangi",500.4f);
        Students s2=new Students(120,"prath",505220.4f);
        Students s3=new Students(1650,"shubhangi",52500.4f);
        Students s4=new Students(1,"shweata",6686500.4f);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Collections.sort(list);
        display(list);// for default sorting comparato waapren id base
        //1 shweata 6686500.5
        //  10 shubhangi 500.4
        //  120 prath 505220.4
        //   1650 shubhangi 52500.4

        System.out.println("**********************");
        //class ComparyByName implements Comparator<Student> cha instance pass kara
        Collections.sort(list,new ComparyByName());
        display(list);

        Collections.sort(list,new ComparyBySalary());
        display(list);
        /*
        bydefault ascending salary
         *  10 shubhangi 500.4
            1650 shubhangi 52500.4
            120 prath 505220.4
            1 shweata 6686500.5
         */
        Collections.sort(list,Collections.reverseOrder());
        display(list);
        /*
         * 1650 shubhangi 52500.4
           120 prath 505220.4
            10 shubhangi 500.4
            1 shweata 6686500.5
         */

    }
}
