package ex_27_Exceptions;

public class ex_05_Exception05 {
    public static void main(String[] args){
        String S1 = null;
        try {
            S1.trim();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
