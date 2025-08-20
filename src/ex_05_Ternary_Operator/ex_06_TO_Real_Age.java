package ex_05_Ternary_Operator;

public class ex_06_TO_Real_Age {
    public static void main(String[] args) {
        String user_input = args[0];
        int age = Integer.parseInt(user_input);
        System.out.println(user_input);
        System.out.println(age);

        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(result);

    }
}
