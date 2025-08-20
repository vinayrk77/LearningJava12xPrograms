package ex_06_Type_Casting;

public class ex_02_TypeCasting_02 {
    public static void main(String[] args) {
        byte b = 30;
        int a = b; // Valid Syntax - Widening - Implicit casting - Automatically done

        int a1 = (int)b; // widening Explicit casting - optional
        System.out.println(a1);
    }
}
