package ex_03_Operators;

public class ex_06_Concat {
    //Concatenation
    String s1 = "Vinay";
    String s2 = "Karanjavkar";
    String s3 = s1 + " " + s2; // Concatenation of two strings with a space in between
    String s4 = s1.concat(" ").concat(s2); // Another way to concatenate
    public static void main(String[] args) {
        ex_06_Concat obj = new ex_06_Concat();
        System.out.println(obj.s3); // Output: Vinay Karanjavkar
        System.out.println(obj.s4); // Output: Vinay Karanjavkar
    }


}
