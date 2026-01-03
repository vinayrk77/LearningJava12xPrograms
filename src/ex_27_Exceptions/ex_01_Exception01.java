package ex_27_Exceptions;

public class ex_01_Exception01 {
    public static void main(String[] args){
        System.out.println("starting of a program");
        String ip = args[0]; // No input - java.lang.ArrayIndexOutOfBoundsException

        int a = Integer.parseInt(ip); // if input is string java.lang.NumberFormatException
        int b = 100/a; // if 0 is added - java.lang.ArithmeticException
        System.out.println(b);
        System.out.println("end of the program");
    }
}
