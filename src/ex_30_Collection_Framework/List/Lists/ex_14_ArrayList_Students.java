package ex_30_Collection_Framework.List.Lists;

import java.util.*;

public class ex_14_ArrayList_Students {
    public static void main(String[] args){
        Students s1 = new Students("Amit", "1");
        Students s2 = new Students("Maxi", "2");
        Students s3 = new Students("Rooney", "3");

        List<Students> mystudents = new ArrayList<>();
        mystudents.add(s1);
        mystudents.add(s2);
        mystudents.add(s3);
        System.out.println(mystudents);
    }
}
