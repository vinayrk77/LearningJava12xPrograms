package ex_30_Collection_Framework.List.MAP;
import java.util.*;

public class ex_03_Map_Real {
    public static void main(String[] args){
        Map<String,Object> Student1 = new HashMap<>();

        Student1.put("Name", "Mohit");
        Student1.put("Phone", "7896959623");
        Student1.put("Address", "Mumbai");
        Student1.put("Address_Home", "Vashi");
        System.out.println(Student1);

        Map<String,Object> Student2 = new LinkedHashMap();

        Student2.put("Name", "sakshi");
        Student2.put("Phone", "7896959623");
        Student2.put("Address", "BLR");
        Student2.put("Address_Home", "EC");
        System.out.println(Student2);
    }
}
