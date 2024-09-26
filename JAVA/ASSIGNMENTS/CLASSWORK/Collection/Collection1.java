import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collection1{

    public static void display( List<Integer> list){
        for (Integer ele : list)
        System.out.print(ele);
    }
    public static void main(String args[]){
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(70);
        list.add(850);
         list.add(90);
        list.add(250);

        System.out.println(list);
        Collection1.display(list);

        int max=Collections.max(list);
        System.out.println(max);//850

        System.out.println(Collections.min(list));
         Collections.shuffle(list);
         System.out.println(list);//[90, 250, 70, 20, 10, 850]

         Collections.sort(list);
         System.out.println(list);//[10, 20, 70, 90, 250, 850]

         Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);//[850, 250, 90, 70, 20, 10]
        Collection1.display(list);

    }
}