/*1.Design and implement a class named InstanceCounter to track 
and count the number of instances created from this class. */
class InstanceCounter{
    static int count=0;
    public InstanceCounter(){
        count=count+1;
    }
    public void printcount(){
        System.out.println(count + " no of instance created");
    }
}
class Q1{
    public static void main(String args[]){
        InstanceCounter i1=new InstanceCounter();
        InstanceCounter i2=new InstanceCounter();
        InstanceCounter i3=new InstanceCounter();
        InstanceCounter i4=new InstanceCounter();
        InstanceCounter i5=new InstanceCounter();
        InstanceCounter i6=new InstanceCounter();
        i6.printcount();


    }
}