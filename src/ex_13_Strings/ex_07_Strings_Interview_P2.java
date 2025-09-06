package ex_13_Strings;

public class ex_07_Strings_Interview_P2 {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello";

        String a1 = new String("Hello");
        String a2 = new String("Hello");
        String a3 = new String("hello");

        // == Comparision - Strings - Checks the refrences locations of strings

        System.out.println(s1 == a2);
        System.out.println(s3 == a2);
        System.out.println(s3 == s1);
        System.out.println(a1 == a2);
        System.out.println(a1 == a3);

        // equals - it always checks the content of the string

        System.out.println(s1.equals(a1));
        System.out.println(s2.equals(a1));
        System.out.println(s3.equals(a3));
        System.out.println(s3.equalsIgnoreCase(a3));
    }
}
