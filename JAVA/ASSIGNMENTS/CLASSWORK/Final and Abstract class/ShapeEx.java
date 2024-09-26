
import java.util.Scanner;

abstract class Shape {
    float area;
    public Shape(){}
     public abstract void acceptrecord(Scanner sc);
    public abstract void calculatearea();
    public   void printarea(){
        System.out.println("Area is "+ this.area);
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;
    public Rectangle(){}
    public void acceptrecord(Scanner sc){
     System.out.println("length:    ");
     length=sc.nextInt();

     System.out.println("breadth:   ");
     breadth=sc.nextInt();
    }
    public void calculatearea(){
        area=length*breadth;
    }
}
class Circle extends Shape{
    float radius;
    public Circle(){}
    public void acceptrecord(Scanner sc){
        System.out.println("radius:    ");
        radius=sc.nextFloat();
    }

       public void calculatearea(){
           this.area=(float)(Math.PI * Math.pow(radius, 2));
       }
}
class  utilShape{
    public static int menuList(){
        Scanner sc=new Scanner(System.in);
        System.out.println("0.Exit");
         System.out.println("1.Rectangle");
        System.out.println("2.Circle");
        int choice=sc.nextInt();
        return choice;
    }
}

public class ShapeEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
       while(( choice = utilShape.menuList())!=0){
        Shape shape=null;
        switch (choice) {
            case 1:
                shape=new Rectangle();
                break;
            case 2:
                shape=new Circle();
                break;
        }
        if(shape !=null){
          shape.acceptrecord(sc);
          shape.calculatearea();
          shape.printarea();
        }
       }
    }
}
