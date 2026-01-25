package ex_30_Collection_Framework.List.Set;
import java.util.*;

public class ex_02_AllSet_Example {
    public static void main(String[] args){
        Set<String> h1 = new HashSet();
        // HashSet - Random order
        h1.add("Apple");
        h1.add("Grapes");
        h1.add("Banana");
        h1.add("Banana");
        h1.add("banana");
        h1.add("null");
        //h1.add(123); not generic
        System.out.println(h1);

        System.out.println("_____________");

        Set l1 = new LinkedHashSet();
        l1.add("cars");
        l1.add("bikes");
        l1.add("bikes");
        l1.add("Trucks");
        l1.add("zebra");
        l1.add("null");
        System.out.println(l1);
        //printed as user enters the value.

        System.out.println("_____________");

        Set t1 = new TreeSet();
        t1.add("Tomato");
        t1.add("Carrot");
        t1.add("Avacado");
        t1.add("Spinach");
        t1.add("Spinach");
        t1.add("Mushroom");
        //t1.add(123);
        //t1.add(null); //  java.lang.NullPointerException null not allowed
        System.out.println(t1);
        System.out.println(t1.size());
        System.out.println(t1.contains("Spinach"));
        System.out.println(t1.contains("mushroom"));


    }
}
