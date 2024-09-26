
import java.util.Collection;
import java.util.List;

public class Vector {
    public static void main(String[] args) {
        List<Integer> list=new java.util.Vector<Integer>();
        Collection<Integer> list1=new java.util.Vector<Integer>();

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

        List<Integer> list1=new java.util.Vector<>();
        list1.add(5252);
        list1.add(982);
        list1.add(20245);
        list1.add(5894);
        list.containsAll(list1); 
        System.out.println(list);//[12210, 20245]
        System.out.println(list1);//[5252, 982, 20245, 5894]

        list.removeAll(list1);   
        System.out.println(list); //[12210] 
    }
}
