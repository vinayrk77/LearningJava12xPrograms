package ex_30_Collection_Framework;
import java.util.Vector;

public class ex_04_Vector {
    public static void main(String[] args){
        Vector v = new Vector();

        v.add("mark");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v);
        System.out.println(v.contains("mark"));
    }

}
