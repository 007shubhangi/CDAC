//final reference object
//reference la final krt; instance la nahi. state of instance modify hou shkte 
//pn ekda refence la initialize kelyawr tyat dusra instance assign nahi kru shkt
//final kelywr modify nahi kru skt
class Date{
    int day;
    int month;
    int year;
    public Date()
    {

    }
    public Date(int day,int month,int year)
    {
     this.day=day;
     this.month=month;
     this.year=year;
    }
    public void printRecord()
    {
        System.out.println(this.day + " " + this.month + " "+ this.year);
    } 
    public void setDay(int day){
        this.day=day;
    }
    public int getDay(){
        return this.day;
    }

}
public class Final_reference{
    public static void main(String[] args) {
        final Date d1=new Date(10,20,30);
        d1.printRecord();
        d1.setDay(9);
        System.out.println(d1.getDay());

         //d1=new Date();The final local variable d1 cannot be assigned. It must be blank

    }
}