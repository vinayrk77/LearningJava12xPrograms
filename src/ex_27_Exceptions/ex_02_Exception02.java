package ex_27_Exceptions;

public class ex_02_Exception02 {
    public static void main(String[] args){
        int a = 0;
        int b = 100;
        int c = b/a;
        System.out.println(c);
        // unknown -> java.lang.ArithmeticException

        String name = null;
        name.trim();
        // unknown -> java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null
    }
}
