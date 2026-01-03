package ex_27_Exceptions;

public class ex_07_Exception07 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = 10/c;
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
}
}
