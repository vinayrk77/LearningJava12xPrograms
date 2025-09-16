package ex_15_StringBuilder_StringBuffer;

public class ex_04_StrinBuffer {
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("Hello");
        sb = sb.append(" World");
        sb.reverse();
        System.out.println(sb);
    }
}
