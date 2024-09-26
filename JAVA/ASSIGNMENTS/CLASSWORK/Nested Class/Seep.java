public class Seep {
    public static void main(String[] args) {
        try {
            int i;
            for(i=0;i<=10;i++){
                System.out.println(i);
                Thread.sleep(350);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
