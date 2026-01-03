package ex_27_Exceptions;

public class ex_09_Finally {
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        try {
            b = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("I will be always executed");
        }
    }
}
