//using throws
public class SleepMultiple {
    public static void display(){
       try{
        for (int i=1;i<=10;i++){
            System.out.println("i "+ i);
           Thread.sleep(250);//static method of Thred class
        }
    }catch(InterruptedException e){
        e.printStackTrace();
     }
    }
    public static void show() throws InterruptedException{
        try{
         for (int i=1;i<=10;i++){
             System.out.println("i "+ i);
            Thread.sleep(250);//static method of Thred class
         
         }
     }finally{}
    }
     public static void main(String[] args) {
        try {
            SleepMultiple.show();
           // s1.display();
        } catch (InterruptedException e) {
        }
     }
}

