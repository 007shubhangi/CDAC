
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferReadAppend{
    public static void main(String[] args)  throws IOException
    {
        File file=new File("myfile.txt");//read file

        if(!file.exists()){
            System.out.println("file not exists");
        }

        FileInputStream read1=new FileInputStream(file);
       // FileOutputStream write1=new FileOutputStream("myoutput1.txt");
       /*if file not exists create file
        if file present override it*/

        FileOutputStream write1=new FileOutputStream("myoutput1.txt",true);//by true we apend the file

        BufferedInputStream bufr=new BufferedInputStream(read1);
        BufferedOutputStream bufw=new BufferedOutputStream(write1);
        
      int choice;
       while((choice = bufr.read())!=-1){
      
        bufw.write(choice);
       }

       bufr.close();
       bufw.flush();
       bufw.close();
    }
}