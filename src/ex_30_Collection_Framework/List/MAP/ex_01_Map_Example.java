package ex_30_Collection_Framework.List.MAP;
import java.util.*;

public class ex_01_Map_Example {
    public static void main(String[] args){
        Map m1 = new HashMap();
        // Map is a key value
        //Name : Vinay
        // roll no : 25
        // phone no : 9289393739

        // PUT is the value to add key in Map

        m1.put("Name", "Don");
        m1.put("Roll No", "25");
        m1.put("phone No", "9883738393");
        System.out.println(m1);

        Map m2 = new LinkedHashMap();

        m2.put("Name", "Gone");
        m2.put("Roll No", "26");
        m2.put("phone No", "7883738393");
        System.out.println(m2);

        Map m3 = new TreeMap();

        m3.put("Name", "Bon");
        m3.put("Roll No", "27");
        m3.put("phone No", "4583738393");
        System.out.println(m3);

    }
}
