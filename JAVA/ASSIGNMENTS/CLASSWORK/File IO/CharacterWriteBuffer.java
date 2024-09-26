//Buffer ,readLine(),write data from one fle to another new file
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterWriteBuffer {
    public static void main(String[] args) throws  IOException {
        FileReader read1=new FileReader("myfile.txt");
        FileWriter  write1=new FileWriter("chfilewritebuff.text");

        BufferedReader read12=new BufferedReader(read1);
        BufferedWriter write12=new BufferedWriter(write1);

        //readLine() comes with characyter buffer read line by line
        String ch;
        while((ch= read12.readLine())!=null)
        {
            System.out.println(ch);
            //write12.write(ch);//single line mdhe print hoil
            write12.write(ch+"\n");  
        }
        read12.close();
        write12.flush();;
        write12.close();
    
    }
    public static void main1(String[] args) throws IOException{
        FileReader read1=new FileReader("myfile.txt");
        FileWriter  write1=new FileWriter("chfilewritebuff.text");

        BufferedReader read12=new BufferedReader(read1);
        BufferedWriter write12=new BufferedWriter(write1);

        int ch;
        while((ch= read12.read())!=-1)
        {
            write12.write(ch);
        }
        read12.close();
        write12.flush();;
        write12.close();
    }
}
