package ex_30_Collection_Framework.List.MAP;
import java.util.*;

public class ex_02_Map_Example {
    public static void main(String[] args){
        Map s1 = new HashMap();
        s1.put("id",1);
        s1.put("id",2);
        s1.put("id2",2);
        s1.put("id4",null);
        s1.put("null",30);
        s1.put("null",40);
        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
        System.out.println(s1.containsKey("id2"));
        System.out.println(s1.containsKey("id1"));
        System.out.println(s1.containsValue(null));


        System.out.println(s1.keySet());
        System.out.println(s1.values());
        System.out.println(s1.get("null"));
    }
}
