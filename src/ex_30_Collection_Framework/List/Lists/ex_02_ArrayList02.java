package ex_30_Collection_Framework.List.Lists;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ex_02_ArrayList02 {
    public static void main(String[] args){
        List list = new ArrayList<>();
        list.add("1"); //0
        list.add("2"); //1
        list.add("3"); //2
        list.add("3"); //3
        list.add("4"); //4
        list.add("5"); //5
        list.add("true");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("5"));
        System.out.println(list.contains(5)); //false because of integer
        System.out.println(list.indexOf("5"));
        System.out.println(list);

        for(int i = 0; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }
        for(Object o:list){
            System.out.println(o);

        }

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
