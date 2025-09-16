package ex_15_StringBuilder_StringBuffer;

public class ex_03_StrinBuilder {
    public static void main(String[] args){

        StringBuilder stringBuilder = new StringBuilder("vinay");
        stringBuilder.append("Hot");
        System.out.println(stringBuilder);

        String s1 = "Vinay";
        s1 = s1 + "Smart";
        System.out.println(s1);

    }
}
