package ex_30_Collection_Framework.List.Lists;
import java.util.*;

public class ex_09_Interview {
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        for(Integer o:list){
            System.out.println(6*o);

        }

    }
}
