package ex_05_Ternary_Operator;

public class ex_04_TO_Three_Max {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 20;
        int n3 = 25;
        int Max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2>n3) ? n2 : n3);
        System.out.println(Max);
    }
}