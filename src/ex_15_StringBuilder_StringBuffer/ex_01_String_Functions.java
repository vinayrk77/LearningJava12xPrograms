package ex_15_StringBuilder_StringBuffer;

public class ex_01_String_Functions {
    public static void main(String[] args){
        String a1 = "Vinay";
        System.out.println(a1.length());
        System.out.println(a1.charAt(2));
        System.out.println(a1.charAt(1));
        System.out.println(a1.concat(" Karanjavkar"));
        System.out.println(a1.contains("Vi"));
        System.out.println(a1.indexOf("i"));
        System.out.println(a1.replace("Vinay" , "Vijay"));
    }
}
