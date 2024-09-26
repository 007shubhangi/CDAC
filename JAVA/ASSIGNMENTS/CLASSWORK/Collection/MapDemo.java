
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "shubhu");
        map.put(2, "prath");
        map.put(1, "shubhangi");
        map.put(4, "harshada");
        map.put(5,null);

        System.out.println(map);//{1=shubhangi, 2=prath, 4=harshada}

        map.remove(4);
        System.out.println(map);//{1=shubhangi, 2=prath} 

        System.out.println(map.containsKey(1));//true

       System.out.println( map.get(1));
       System.out.println( map.getOrDefault(6,"others") );

       System.out.println(map.containsValue("prath"));//true

       System.out.println(map.replace(1, "rani"));
       System.out.println(map);//{1=rani, 2=prath, 5=null}

       System.out.println(map.remove(5, "null"));
       System.out.println(map);

       System.out.println(map.remove(2));
       System.out.println(map);//{1=rani, 5=null}

       System.out.println(map.remove(1, "rani"));
       System.out.println(map);//{5=null}

       map.put(10, "radha");
       map.put(11, "radhika");
       map.put(17, "radharani");

       System.out.println(map);//{17=radharani, 5=null, 10=radha, 11=radhika}
       System.out.println(map.keySet());//[17, 5, 10, 11]
       System.out.println(map.values());//[radharani, null, radha, radhika]

       System.out.println(map.size());//4
       System.out.println(map.entrySet());//[17=radharani, 5=null, 10=radha, 11=radhika]
    } 
}
