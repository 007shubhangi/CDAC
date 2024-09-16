/*
 5)	Write a Java program to create a base class Vehicle with
methods startEngine() and stopEngine(). Create two subclasses
Car and Motorcycle. Override the startEngine() and stopEngine()
methods in each subclass to start and stop the engines 
differently.
 */
abstract class Vehicle{
    abstract public void startEngine();
    abstract public void stopEngine();
}
class Car extends Vehicle{
    public void startEngine(){
    System.out.println("Car engine started with a key.");
    }
    public void stopEngine(){
    System.out.println("Car engine stoped when turn off key.");
    }
}
class Motorcycle extends Vehicle{
    public void startEngine(){
    System.out.println("Motorcycle engine started with a key and kick.");
    }
    public void stopEngine(){
    System.out.println("Motorcycle engine stoped with a key.");   
    }
}
class  Q5{
public static void main(String[] args) {
    Car creta=new Car();
    creta.startEngine();
    creta.stopEngine();

    Motorcycle passion=new Motorcycle();
    passion.startEngine();
    passion.stopEngine();
}
}