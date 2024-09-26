
class Base{
    public void printRecord(){}
}
class Derive extends  Base{
     public void printRecord()throws RuntimeException{
          try {
               for (int i=1;i<=10;i++){
                    System.out.println(" i   :"+i);
                    if (i==3){
                         throw new InterruptedException();
                          Thread.sleep(250);
                    }
   
               }
              
          }
           catch (InterruptedException cause) {
              throw new RuntimeException(cause);
          }
     }
}
public class ExceptionChaining{
     public static void main(String[] args) {
          try {
              Base b=new Derive();
              b.printRecord();
          } 
          catch (RuntimeException A) {
               Throwable cause=A.getCause();
               System.out.println(cause);
          }
        
     }
}