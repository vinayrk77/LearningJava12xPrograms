package ex_10_For_Loop;
import java.util.Scanner;

public class ex_10_For_Loop_Fact {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        if (fact == 0){
            fact = 1;
        }
        for (int i = 1; i <= n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
