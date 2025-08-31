package ex_09_Switch;
import java.util.Scanner;

public class ex_04_Real_Automation_use {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser name");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch(browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("TC1");
                System.out.println("TC2");
                System.out.println("TC3");
                break;
            case "Firefox":
                System.out.println("Starting the Firefox");
                System.out.println("TC1");
                break;
            case "Edge":
                System.out.println("Starting the Microsoft Edge");
                System.out.println("TC1");
                break;
            default:
                System.out.println("I dont know this browser");
                break;
        }
    }
}
