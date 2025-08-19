package ex_03_Operators;

public class ex_07_Concat_Plus {
    public static void main(String[] args) {
        String a1 = "Vinay";
        String a2 = "King";
        
        int a = 10;
        int b = 20;
        
        System.out.println(a1 + a2 + a +b);
        System.out.println(a +b + a1 + a2);
        System.out.println(a1 + a2 + (a +b));
    }
}
