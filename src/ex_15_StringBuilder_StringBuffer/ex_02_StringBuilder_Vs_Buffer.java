package ex_15_StringBuilder_StringBuffer;

public class ex_02_StringBuilder_Vs_Buffer {
    public static void main(String[] args){
        String s1 = "vinay";
        String a1 = new String("vinay");

        StringBuffer stringBuffer = new StringBuffer("Vicky");
        StringBuilder stringBuilder = new StringBuilder("lana");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
