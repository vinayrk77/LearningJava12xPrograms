package ex_30_Collection_Framework.List.Queue;
import java.util.*;

public class ex_02_LinkedAs_Queue {
    public static void main(String[] args){
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(2);
        q1.add(10);
        q1.add(20);

        Iterator<Integer> iterator = q1.iterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
