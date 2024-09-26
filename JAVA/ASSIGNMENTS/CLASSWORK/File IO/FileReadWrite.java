
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) throws  IOException {
        File file=new File("myfile.txt");
        File newfile=new File("myNewFile.txt");

        if(!file.exists()){
            System.out.println("file not exists");
        }
        FileInputStream readf=new FileInputStream(file);
        FileOutputStream writef=new FileOutputStream(newfile);

        int ch;
        while((ch=readf.read())!=-1){
            writef.write((char)ch);
        }

        readf.close();
        writef.close();

    }
}
