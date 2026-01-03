package ex_27_Exceptions;

public class ex_11_Exception09 {
    public static void main(String[] args){
        System.out.println("starting of a program");
        try {
            String ip = args[0]; // No input - java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // if input is string java.lang.NumberFormatException
            int b = 100/a; // if 0 is added - java.lang.ArithmeticException
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be always executed");
        }

    }
}
