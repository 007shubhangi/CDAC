
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import  java.util.Iterator;
import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class List1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();

        System.out.println(list.isEmpty());
        list.add(12210);
        list.add(20245);
        list.add(8520);
        list.add(7850);
        System.out.println(list);
        for (Integer ele:list){
            System.out.println(ele);
        }
        System.out.println(list.size());//4

        list.remove(2);
        System.out.println(list);//[12210, 20245, 7850]

        list.remove(Integer.valueOf(7850));
        System.out.println(list);//[12210, 20245]

        System.out.println(list.contains(50));//false

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(5252);
        list1.add(982);
        list1.add(20245);
        list1.add(5894);
        list.containsAll(list1); 
        System.out.println(list);//[12210, 20245]
        System.out.println(list1);//[5252, 982, 20245, 5894]

        list.removeAll(list1);   
        System.out.println(list); //[12210] 
        
        list.addAll(list1);
        System.out.println(list);//[12210, 5252, 982, 20245, 5894]

        list.retainAll(list1);
        System.out.println(list);//[5252, 982, 20245, 5894]

        list.clear();
        System.out.println(list);//[]

        Object[]a=list.toArray();
        for (Object elem : a) {
            Integer i=(Integer)elem;
            System.out.println(i);
        }
        System.out.println(list);

        List<Integer> l1=new ArrayList<Integer>();
        l1.addAll(list1);
        System.out.println(l1);//[5252, 982, 20245, 5894]

       System.out.println( l1.get(0));// 5252

       l1.set(0, 5000);
       System.out.println(l1);//[5000, 982, 20245, 5894]

       l1.add(1, 4572111);
       System.out.println(l1);//[5000, 4572111, 982, 20245, 5894]

       l1.remove(2);
       System.out.println(l1);//[5000, 4572111, 20245, 5894]

      System.out.println(l1.indexOf(4572111));//1

      ArrayList<String> s1=new ArrayList<String>();
      s1.add("chuki"); 
      s1.add("rabbs");
      s1.add("rab44bs");

    java.util.Iterator<String> itr=s1.iterator();
     while(itr.hasNext()){
         System.out.println(itr.next());}

     List<String> itr1=s1.subList(0, 2);
        System.out.println(itr1);   //[chuki, rabbs]





    }
}
