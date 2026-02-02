package ex_30_Collection_Framework.List.MAP;
import java.util.*;

public class ex_05_Map_And_Array {
    public static void main(String[] args){
        Map std1 = new HashMap();
        std1.put("Name", "Vikas");
        std1.put("Phone", "8993839303");
        std1.put("Address", "Mumbai");
        System.out.println(std1);

        Map std2 = new HashMap();
        std2.put("Name", "Harsh");
        std2.put("Phone", "990339373");
        std2.put("Address", "Delhi");
        System.out.println(std2);

        List Students = new ArrayList();
        Students.add(std1);
        Students.add(std2);
        System.out.println(Students);
    }
}
