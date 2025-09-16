package ex_14_Strings;

public class ex_01_Strings_Immutable {
    public static void main(String[] args){
        String name = "Vinay"; // This will be stores in string constant pool (SCP)
        name.toUpperCase();
        System.out.println(name); // The OP will not change to uppercase because trings are immutable
    }
}
