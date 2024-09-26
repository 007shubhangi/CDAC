
import javax.sound.midi.Soundbank;

public class Sleep{
     public static void main(String[] args) {
     try{
        for (int i=1;i<=10;i++){
            System.out.println("i "+ i);
           Thread.sleep(250);//static method of Thred class
        
        }
    }catch(InterruptedException e){
        e.printStackTrace();
    }
     }
}
