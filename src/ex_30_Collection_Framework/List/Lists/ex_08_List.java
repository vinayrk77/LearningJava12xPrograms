package ex_30_Collection_Framework.List.Lists;
import java.util.*;

public class ex_08_List {
    public static void main(String[] args){
        List Marks = new ArrayList<>();
        Marks.add(55);
        Marks.add(89);
        Marks.add(90);
        Marks.add(92);
        System.out.println(Marks);

        //Iterator iterator = Marks.iterator();
        //while (iterator.hasNext())
        //System.out.println(iterator.next());

        Collections.sort(Marks);
        System.out.println(Marks);

        //Reverse
        Collections.sort(Marks, Collections.reverseOrder());
        System.out.println(Marks);
    }
}
