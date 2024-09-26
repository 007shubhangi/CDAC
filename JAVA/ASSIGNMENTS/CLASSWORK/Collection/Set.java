import com.sun.jdi.IntegerValue;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        //java.util.Set<Integer> s2=new EnumSet<>();
        java.util.Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set);//[20, 10, 30]
        set.remove(10);
        System.out.println(set);//[20, 30]

        System.out.println("************ LinkedHashSet *********************");
        java.util.Set<Integer> s=new LinkedHashSet<>();
        s.add(455);
        s.add(550);
        s.add(8);
        s.add(8);
        s.add(50);
        s.add(80);
        s.add(550);
        System.out.println(s);//[455, 550, 8, 50, 80]
        System.out.println(s.remove(455));//true
        System.out.println(s);//[550, 8, 50, 80]

        System.out.println("************ TreeSet *********************");
        java.util.Set<Integer> s1=new TreeSet<>();
        s1.add(74);
        s1.add(7);
        s1.add(85);
        s1.add(96);
        s1.add(7);
        s1.add(7);
        System.out.println(s1);//[7, 74, 85, 96]
        System.out.println(s1.contains(4));//false
        System.out.println(s1.remove(7));
        System.out.println(s1);//[74, 85, 96]

    }
}
