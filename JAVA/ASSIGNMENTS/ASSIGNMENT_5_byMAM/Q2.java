/*2)Create a base class Vehicle with attributes like make
 and year. Provide a constructor in Vehicle to initialize 
 these attributes. Derive a class Car that has an additional
  attribute model and write a constructor that initializes make, 
year, and model. 
Write a program to create a Car object and display its details. */
class Vehicle{
    String make;
    int year;
    public Vehicle(){
    }
    public Vehicle(String make,int year){
        this.make=make;
        this.year=year;
    }
}
class Car extends Vehicle{
    String model;

    public Car(String make,int year,String model){
        super(make,year);
        this.model=model;
    }
    public void displayDetails(){
     System.out.println("make:      "+this.make);
     System.out.println("year:      "+this.year);
     System.out.println("model:      "+this.model);

    }
}
public class Q2{
    public static void main(String[] args) {
        Car creta=new Car("tata",1999,"vircus");
        creta.displayDetails();
    }
}
