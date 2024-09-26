//read data from other file
import  java.io.*;
public class FileRead {
    public static void main(String[] args) throws IOException
     {
        File file=new File("myfile.txt");//relative path
        if(!file.exists()){
            System.out.println("file not exists");
        }
        FileInputStream f1=new FileInputStream(file);
        int ch;
        while((ch=f1.read())!=-1){
            //System.out.print(ch);//return hexadeshimal code
            System.out.print((char)ch);///typecasting
        }
        f1.close();
    }
}
