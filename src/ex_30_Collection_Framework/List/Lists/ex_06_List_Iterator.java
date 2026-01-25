package ex_30_Collection_Framework.List.Lists;
import java.util.*;

public class ex_06_List_Iterator {
    public static void main(String[] args){
        List list = new ArrayList<>();

        list.add("Milk");
        list.add("Butter");
        list.add("Bread");
        list.add("Cheese");
        list.add("Strawberry");
        list.add("jam");
        list.add(123);
        list.add(true);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(1));

        System.out.println("_______");

        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        System.out.println(iterator.next());
    }
}
