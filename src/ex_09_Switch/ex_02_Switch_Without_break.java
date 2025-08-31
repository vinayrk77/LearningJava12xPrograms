package ex_09_Switch;

import java.util.Scanner;

public class ex_02_Switch_Without_break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {

                case 1:
                    System.out.println("Monday");
                case 2:
                    System.out.println("Tuesday");
                case 3:
                    System.out.println("Wednesday");
                case 4:
                    System.out.println("Thursday");
                case 5:
                    System.out.println("Friday");
                case 6:
                    System.out.println("Saturday");
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter number from 1 to 7, You bloody idiot");
            }
        } else {
            System.out.println("Are you mad, Why are you entering non Integer values");
        }
        System.out.println("This the end of the program");
    }
}

