/*
 3)Create a base class Animal with attributes like name, 
 and methods like eat() and sleep(). Create a subclass 
 Dog that inherits from Animal and has an additional 
 method bark(). Write a program to demonstrate the use 
 of inheritance by creating objects of Animal and Dog 
 and calling their methods.
 */
class Animal{
    String name;
   public Animal(){}
   public void eat(){
   System.out.println("Animal eats");
   }
   public void sleep(){
   System.out.println("Animal sleeps");
   }
}
class Dog extends Animal{
    public Dog(){}
    public void bark(){
     System.out.println("Dog barks");
    }
}
public class Q3{
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eat();
        animal.sleep();

        Dog tom=new Dog();
        tom.eat();
        tom.sleep();
        tom.bark();
    }
}
