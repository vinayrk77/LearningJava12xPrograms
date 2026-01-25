package ex_30_Collection_Framework.List.Set;
import java.util.*;

public class ex_03_TreeSet {
    public static void main(String[] args){
        Set<Integer> y1 = new TreeSet<>();

        y1.add(1);
        y1.add(4);
        y1.add(9);
        y1.add(20);
        y1.add(20);
        y1.add(50);
        System.out.println("Set Elements: " + y1);

        Iterator iterator = y1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
