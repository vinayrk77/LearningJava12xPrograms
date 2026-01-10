package ex_29_Generic;

public class ex_02_Generic02 {
    public static void main(String[] args) {
        temp(3, 4);
        temp(3.54, 4.07);

    }

    static <T> T temp(T a, T b) {
        System.out.println(a + "" + b);
        return null;
    }
}
