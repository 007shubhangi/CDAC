import java.util.*;
import javax.sound.midi.Soundbank;
public class Queue {
  public static void main(String[] args) {
    java.util.Queue<Integer>que=new LinkedList<Integer>();
    //java.util.Queue<String> q=new ArrayList<String>();//Not ok
    java.util.Queue<String> q=new ArrayDeque<String>();
    java.util.Queue<String> q1=new PriorityQueue<String>();

    System.out.println(que.isEmpty());//true
    que.add(10);
    que.add(70);
    que.add(1550);
    que.add(1980);
    que.add(6510);
    que.offer(789);

    System.out.println(que);//[10, 70, 1550, 1980, 6510, 789]
     que.offer(58);
     que.offer(89);
     System.out.println(que);//[10, 70, 1550, 1980, 6510, 789, 58, 89]

     System.out.println(que.poll());//10
     System.out.println(que.remove());//70
     System.out.println(que);//[1550, 1980, 6510, 789, 58, 89]

     System.out.println(que.peek());//1550
     System.out.println(que.element());//1550

     while(!que.isEmpty())
       System.out.println(que.poll());
            
    System.out.println(que.poll());//null
    System.out.println(que.remove());//exception
    //NoSuchElementException  
}}
