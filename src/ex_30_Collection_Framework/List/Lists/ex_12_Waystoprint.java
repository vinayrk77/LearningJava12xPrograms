package ex_30_Collection_Framework.List.Lists;
import java.util.*;

public class ex_12_Waystoprint {
    public static void main(String[] args){
        List name = new ArrayList();
        name.add("mia");
        name.add("Lisa");
        name.add("Eva");

        for(Object ol:name){
            System.out.println(ol);
        }
        System.out.println("_______");

        Iterator iterator = name.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
