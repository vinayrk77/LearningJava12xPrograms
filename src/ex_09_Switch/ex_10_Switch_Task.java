package ex_09_Switch;
import java.util.Scanner;

public class ex_10_Switch_Task {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grades you have got");
        String Grades = scanner.next();
        Grades = Grades.toUpperCase();

        switch (Grades){
            case "A":
            System.out.println("Excellent");
            break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Needs Improvement");
                break;
            case "F":
                System.out.println("Fail, You are dumb");
                break;
            default:
                System.out.println("Invalid Grade");


        }
    }
}
