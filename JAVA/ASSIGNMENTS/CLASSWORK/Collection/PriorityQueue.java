public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pr=new  java.util.PriorityQueue<Integer> ();
        java.util.Queue<Integer> pr1=new  java.util.PriorityQueue<Integer> ();

        pr1.offer(80);
        pr1.offer(90);
        pr1.offer(100);
        pr1.offer(10);
        pr1.offer(10250);
        pr1.offer(8);

        System.out.println(pr1);//[8, 80, 10, 90, 10250, 100]
        System.out.println(pr1.poll());//8

        System.out.println(pr1);//[10, 80, 100, 90, 10250]
        System.out.println(pr1.poll());//10

        System.out.println(pr1);//[80, 90, 100, 10250]

        System.out.println("****************************");
        java.util.Queue<Integer> pr2=new  java.util.PriorityQueue<Integer> ((a,b)->(b-a));
        pr2.offer(80);
        pr2.offer(190);
        pr2.offer(100);
        pr2.offer(120);
        System.out.println(pr2);//[190, 120, 100, 80]
        System.out.println(pr2.poll());
        System.out.println(pr2);
        System.out.println(pr2.poll());

    }
}
