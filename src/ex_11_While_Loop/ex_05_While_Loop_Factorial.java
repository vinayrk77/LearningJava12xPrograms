package ex_11_While_Loop;
import java.util.Scanner;

public class ex_05_While_Loop_Factorial {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program");
        System.out.println("Enter the number for which you want the factorial");

        if(!scanner.hasNextInt()){
            System.out.println("Enter the integer value, you fool and rerun the program");
        }
        int number = scanner.nextInt();
        int factorial = 1;

        if (number <= 0){
            System.out.println("Factorial is ->" +factorial);
        }
        if (number > Integer.MAX_VALUE){
            System.out.println("Can't get the factorial as out of bound(int)");
        }
        int i = 1;
        while(i <= number){
            factorial = factorial*i;
            i++;
        }
        System.out.println("Factorial is ->" +factorial);
    }

}
