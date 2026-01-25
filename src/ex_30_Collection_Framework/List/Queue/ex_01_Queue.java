package ex_30_Collection_Framework.List.Queue;
import java.util.*;

public class ex_01_Queue {
    public static void main(String[] args){
        PriorityQueue q1 = new PriorityQueue();
        q1.add("Sonu");
        q1.add("Tapu");
        q1.add("Gogi");
        q1.add("Goli");
        q1.add("Pinku");
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.poll());
        System.out.println(q1);
    }
}
