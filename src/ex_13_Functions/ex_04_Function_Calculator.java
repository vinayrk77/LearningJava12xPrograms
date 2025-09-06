package ex_13_Functions;
import java.util.Scanner;

public class ex_04_Function_Calculator {
    public static void main(String[] args){
        //create function for add, sub, div multi and mod
        // with parameter a,b (take input from user)
        Scanner scanner = new Scanner(System.in);
        int a = readint(scanner, "Enter the first no: ");
        int b = readint(scanner, "Enter the second no: ");

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_multi = multi(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a, b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_multi);
        System.out.println(result_div);
        System.out.println(result_mod);
    }
    static int readint(Scanner scanner, String prompt){
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }else {
            System.out.println("Enter an Int only.");
            System.exit(0);
            return -1;
        }
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int multi(int a, int b){
        return a*b;
    }
    static int div(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a/b;
    }
    static int mod(int a, int b){
        return a%b;
    }
}
