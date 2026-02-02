package ex_30_Collection_Framework.List.MAP;
import java.util.*;

public class ex_06_HashTable {
    public static void main(String[] args){
        // Map - K V - null values are allowed
        // Hash Table - synchoronised, slow legacy class thread safe
        // T1 T2 they will be used one by one

        Hashtable<Integer,String> HT1 = new Hashtable<>();
        HT1.put(1, "One");
        HT1.put(2, "Two");
        HT1.put(3, "Three");
        HT1.put(4, "Four");
        // HT1.put(5, null); java.lang.NullPointerException no null allowed
        System.out.println(HT1);
    }
}
