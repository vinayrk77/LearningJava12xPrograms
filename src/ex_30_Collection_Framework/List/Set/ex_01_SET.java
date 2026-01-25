package ex_30_Collection_Framework.List.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ex_01_SET {
    public static void main(String[] args){
        Set s1 = new HashSet();
        Set lsh = new LinkedHashSet();
        Set T1 = new TreeSet();

        s1.add("Vinay");
        s1.add("vinay");
        s1.add("vinay");
        s1.add("Cinay");
        System.out.println(s1);
    }
}
