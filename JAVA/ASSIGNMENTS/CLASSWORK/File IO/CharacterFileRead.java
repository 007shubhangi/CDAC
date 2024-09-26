
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterFileRead {
      public static void main(String[] args) throws IOException {
            FileReader read1=new FileReader("myoutput1.txt");
            FileWriter write1=new FileWriter("newcharfile.txt");
  
            int ch;
           while((ch= read1.read())!=-1){
                 System.out.print((char)ch);
                 write1.write(ch);
           }  
      }
    public static void main1(String[] args)throws IOException {
        FileReader read1=new FileReader("myoutput1.txt");
  
        int ch;
       while((ch= read1.read())!=-1){
             System.out.print((char)ch);
       }
      }
}
