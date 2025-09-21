package ex_16_Arrays;
import java.util.Scanner;

public class ex_16_Arrays_2D_Left_Traingle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to print");
        int n = scanner.nextInt();

        for(int i = n; i >=1 ; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
