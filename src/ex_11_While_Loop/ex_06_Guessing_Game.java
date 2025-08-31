package ex_11_While_Loop;
import java.util.Scanner;
import java.util.Random;

public class ex_06_Guessing_Game {
    public static void main(String[] args){

        Random random = new Random();
        int numbertoguess = random.nextInt(100) +1;
        //System.out.println(numbertoguess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int guess;
        int attempts = 0;
        while(true){
            guess = scanner.nextInt();
            attempts++;

            if(guess < numbertoguess){
                System.out.println("Number is to Low, try again");
            }else if(guess > numbertoguess){
                System.out.println("Number is to High, try again");
            }
            else{
                System.out.println("You gussed it correctly in " +attempts+ " attempts");
                break;
            }
        }
    }
}
