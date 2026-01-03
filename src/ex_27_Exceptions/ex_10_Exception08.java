package ex_27_Exceptions;
import java.util.Scanner;

public class ex_10_Exception08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        try {
            int v = scanner.nextInt();
            a = 10/v;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Closing the scanner class");
            System.out.println(a);
        }
    }
}
