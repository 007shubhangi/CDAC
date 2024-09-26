class InstanceCounter{
    private static int count;//static field

    public InstanceCounter()
    {
     InstanceCounter.count=InstanceCounter.count + 1;
     System.out.println("inside parameterless constructor");

    }
    public static int getcount()//static method
    {
        return InstanceCounter.count;
    }
}
public class Static_Method2{
    public static void main(String[] args) {
        System.out.println(InstanceCounter.getcount());

        InstanceCounter count = new InstanceCounter();
        System.out.println(InstanceCounter.getcount());

        InstanceCounter count1 = new InstanceCounter();
        System.out.println(InstanceCounter.getcount());

        InstanceCounter count2 = new InstanceCounter();
         System.out.println(InstanceCounter.getcount());

    }
}