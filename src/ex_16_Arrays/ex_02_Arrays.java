package ex_16_Arrays;

public class ex_02_Arrays {
    public static void main(String[] args){
        int marks [] = {34,55,67,66,98,99,96};
        // 2n way to create array
        int [] marks2 = new int[5];
        int marks3 [] = new int[5]; // Fixed size

        String[] names = new String[3];
        names[0] = "Vinay";
        names[1] = "Vin";
        names[2] = "harsh";

        System.out.println(marks[0]);
        System.out.println(marks2[0]);
        System.out.println(names[0]);
    }
}
