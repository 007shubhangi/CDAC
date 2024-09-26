
import java.util.ArrayDeque;

public class ArrayDeque{
    public static void main(String[] args) {
        java.util.Queue<String> q1=new ArrayDeque<>();
        //only queue che methods use krta yetat dequeue cha nahi
        //add(), remove()

        ArrayDeque<Integer> arr=new ArrayDeque<>();
        //Arraydequeue cha method sue krta yetat
        //addFirst(), Addlast()
        arr.offer(10);
        arr.offerFirst(20);
        arr.offerLast(74);
        arr.offerLast(76);
        arr.offerLast(74);
        System.out.println(arr);

        System.out.println(arr.poll());//10
        System.out.println(arr.pollFirst());//20
        System.out.println(arr.peekLast());//74
        System.out.println(arr);//[74, 76, 74]

        System.out.println(arr.peekLast());//74
        System.out.println(arr.peekFirst());//74


    }
}
