import java.io.*;
public class Bytestream{
    public static void main(String args[]) throws IOException 
    {
              File f=new File("myfile.txt");
              File f1=new File("myoutput.txt");
              if(!f.exists()){
                System.out.println("file not exists");
                return;
              }
            
                FileInputStream fis=new FileInputStream(f);
                FileOutputStream out=new FileOutputStream(f1);

                int ch;
                while((ch=fis.read())!=-1)
                {
                   // System.out.print(ch);
                    /*
                     * 1041011081081113210511632105115321021051081013
                     * 2737913101021051141151163210010110911132111102329
                     * 91141019711610511010332102105108101program 
                     * executes sucessfully!!!
                     */

                     System.out.print((char)ch);
                      /*hello it is file IO */
                      out.write(ch);
                }
                fis.close();
                out.close();
                System.out.println("program executes sucessfully!!!");

              
    }
}