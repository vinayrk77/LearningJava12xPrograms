package ex_30_Collection_Framework.List.Lists;
import java.util.Stack;

public class ex_13_Stack {
    public static void main(String[] args){
        Stack s = new Stack(); //Last in first out

        s.add("joe");
        s.add("mo");
        s.add("toe");
        s.push("toe");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("oswald"));
        System.out.println(s);
        s.add("Kite");
        s.add("Kite");
        s.push("Baby");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}
