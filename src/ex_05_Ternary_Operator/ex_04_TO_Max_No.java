package ex_05_Ternary_Operator;

public class ex_04_TO_Max_No {
    public static void main(String[] args) {
        // Find the max between two numbers
        int x = 100;
        int y = 200;
        System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println(max);
    }
}
