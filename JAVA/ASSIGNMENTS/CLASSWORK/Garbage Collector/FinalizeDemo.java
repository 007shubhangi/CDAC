public class FinalizeDemo{
    public FinalizeDemo(){
        System.out.println("object created");
    }
    public  void finalize(){
        System.out.println("Garbage collector");

    }
    public static void main(String args[]){
        FinalizeDemo f=new FinalizeDemo();
        FinalizeDemo f1=new FinalizeDemo();
        f=f1;//by assigning reference to another reference

        FinalizeDemo f3=new FinalizeDemo();
        f3=null;//by assigning null

        new FinalizeDemo();


        System.gc();
    }
}