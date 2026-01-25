package ex_30_Collection_Framework.List.Lists;
import java.util.*;

public class ex_07_Nested_ArrayList {
    public static void main(String[] args){
        List<String> Fruits1 = new ArrayList();

        Fruits1.add("Orange");
        Fruits1.add("Grapes");
        Fruits1.add("Mangoes");
        //Fruits1.add(123);
        System.out.println(Fruits1);

        List Fruit2 = new ArrayList<>();

        Fruit2.add("Watermelon");
        Fruit2.add("Apples");
        Fruit2.add("Leechies");
        Fruit2.add(123);
        System.out.println(Fruit2);

        List Vegetables = new ArrayList();

        Vegetables.add("Beans");
        Vegetables.add("Spinach");
        Vegetables.add("LadyFinger");
        System.out.println(Vegetables);

        System.out.println("______");

        List AllList = new ArrayList();

        AllList.add(Fruits1);
        AllList.add(Fruit2);
        AllList.add(Vegetables);
        System.out.println(AllList);
        System.out.println(AllList.size());
        System.out.println(AllList.get(1));

    }
}
