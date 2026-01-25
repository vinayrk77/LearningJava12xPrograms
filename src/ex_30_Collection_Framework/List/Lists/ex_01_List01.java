package ex_30_Collection_Framework.List.Lists;//package ex_30_Collection_Framework;
import java.util.List;
import java.util.ArrayList;

public class ex_01_List01 {
    public static void main(String[] args){
        List<String> fruits = List.of("apples", "Banana", "Grapes");
        System.out.println(fruits);

        List arrayList = new ArrayList<>();
        arrayList.add("Vinay");
        arrayList.add("null");
        arrayList.add("kumar");
        arrayList.add("kumar");//Duplicate is allowed
        arrayList.add(123);//Different data type is allowed
        //System.out.println(arrayList);
        //System.out.println(arrayList.size());
        //System.out.println(arrayList.indexOf("kumar"));
    }
}
