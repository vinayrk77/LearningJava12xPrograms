package ex_06_Type_Casting;

public class ex_05_TypeCastig_Narrowing_03 {
    public static void main(String[] args) {
        int a = 100;
        float GST = 18.45f;
        // int total = a + GST; - implicit casting - Narrowin
        int total = a + (int)GST; // Explicit casting - Narrowing
        System.out.println(total);

        float total2 = a + GST; // wideming - auto - implicit
        System.out.println(total2);
    }
}
