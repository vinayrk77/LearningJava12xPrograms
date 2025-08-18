package ex_01_Java_Basics;

public class Ex04_Common_Maths {
    public static void main(String[] args) {
        // Basic arithmetic operations
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Using Math class for common mathematical operations
        double x = 16.0;
        System.out.println("Square root of " + x + ": " + Math.sqrt(x)); // 4.0
        System.out.println("Power of " + a + " raised to " + b + ": " + Math.pow(a, b)); // 100000
    }
}
