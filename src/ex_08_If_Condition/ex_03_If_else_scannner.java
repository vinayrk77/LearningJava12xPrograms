package ex_08_If_Condition;
import java.util.Scanner;

public class ex_03_If_else_scannner {
    public static void main(String[] args){
        System.out.println("Please Enter Your Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("You can Vote!");
        }else{
            System.out.println("You Cannot Vote!");
        }

    }
}
