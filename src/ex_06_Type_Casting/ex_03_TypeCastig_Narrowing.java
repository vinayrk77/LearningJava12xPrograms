package ex_06_Type_Casting;

public class ex_03_TypeCastig_Narrowing {
    public static void main(String[] args) {
        int a = 500;
        // byte b = a; // Narrowing Implicit JVM to do it data loss will be ther
        byte b = (byte) a;
        System.out.println(b);
    }
}
