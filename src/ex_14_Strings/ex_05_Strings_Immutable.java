package ex_14_Strings;

public class ex_05_Strings_Immutable {
    public static void main(String[] args){
        String name = "Vinay";
        name = name.toUpperCase(); // We are assigning a new value to name VINAY so the OP will be in Capitals
        System.out.println(name);
    }
}
