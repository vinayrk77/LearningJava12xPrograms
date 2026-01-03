package ex_27_Exceptions;

public class ex_08_MultipleProblem {
    public static void main(String[] args){
        int a = 2;
        int b = 0;
        try {
            int c = 10/a;
            String s1 = null;
            s1.trim();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
