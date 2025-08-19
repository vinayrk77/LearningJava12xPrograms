package ex_03_Operators;

public class ex_03_Unary_Operator {
    public static void main(String[] args) {
        int a= +20;
        // it is a unary operator  positive in nature
        int a1 = -120;
        int res = a + a1;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a+a1);
        System.out.println(res);

        int b = -1;
        b = b + 1;
        System.out.println(b);

    }
}
