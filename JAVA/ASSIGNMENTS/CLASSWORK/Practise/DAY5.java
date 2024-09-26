class Date{
    private int day;
    private int month;
    private int year;
    public void setDay(int day) {
        this.day=day;
    }
    public void setMonth(int month) {
        this.month=month;
    }
    public void setYear(int year) {
        this.year=year;
    }
    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }
}
public class DAY5 {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setDay(9);
        d1.setMonth(9);
        d1.setYear(1999);
        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());
        
    }
}
