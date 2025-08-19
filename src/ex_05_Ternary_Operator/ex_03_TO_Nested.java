package ex_05_Ternary_Operator;

public class ex_03_TO_Nested {
    public static void main(String[] args) {
        // Nested
        //result =condition1 ? (condition2 ? expression1 : expression2) : expression3;
        int number = 24;
        String result = (number > 18) ? (number > 25 ? "you can drink" : "You cannot drink") : "You can go to goa";
        System.out.println(result);
    }
}
