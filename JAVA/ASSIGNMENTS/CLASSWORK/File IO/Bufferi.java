
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class Bufferi {
    public static void main(String[] args) throws IOException{
        File file=new File("myfile.txt");
        File newFile=new File("myoutput1.txt");

        if(!file.exists()){
            System.out.println("file not exists");
        }

        FileInputStream read1=new FileInputStream(file);
        FileOutputStream write1=new FileOutputStream(newFile);

        BufferedInputStream buff=new BufferedInputStream(read1);
        BufferedOutputStream buff1=new BufferedOutputStream(write1);

        int choice;
        while((choice=buff.read())!=-1){
            //System.out.print(choice);
            System.out.print((char)choice);

            buff1.write(choice);
        }
        read1.close();
        buff1.flush();
        write1.close();
    
    }
}
