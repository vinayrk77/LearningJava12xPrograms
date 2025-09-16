package ex_15_StringBuilder_StringBuffer;

public class ex_06_StrinBuffre {
    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        sb.delete(5 , 16);
        System.out.println(sb);

        sb.replace(0,4, "C++");
        System.out.println(sb);
    }
}
