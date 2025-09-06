package ex_13_Strings;

public class ex_06_Strings_Interview_P1 {
    public static void main(String[] args){
        String S1 = "Hello";
        String S2 = "Hello";
        String S3 = "Hello";
        String S4 = "hello";
        // There are only 2 strings present in string constant pool Hello and hello

        String T1 = new String("Max");
        String T2 = new String("Max");
        // In Object Area there are 2 strings are preset because new function will always create a new String

        System.out.println(S1);
        System.out.println(S4);
        System.out.println(T2);
    }
}
