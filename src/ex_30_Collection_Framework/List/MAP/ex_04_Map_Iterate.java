package ex_30_Collection_Framework.List.MAP;
import java.util.*;

public class ex_04_Map_Iterate {
    public static void main(String[] args){
        Map<String,Integer> z1 = new HashMap<>();

        z1.put("Id1", 99);
        z1.put("Id2", 199);
        z1.put("Id3", 299);
        z1.put("Id4", 399);
        z1.put("Id5", 499);
        z1.put("Id6", null);
        System.out.println(z1);
        System.out.println(z1.size());

        for(Map.Entry<String,Integer> item: z1.entrySet()){
            System.out.println(item.getKey() + "-> "  + item.getValue());
        }
    }
}
