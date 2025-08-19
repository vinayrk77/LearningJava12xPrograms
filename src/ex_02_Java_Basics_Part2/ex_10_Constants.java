package ex_02_Java_Basics_Part2;

import java.sql.SQLOutput;

public class ex_10_Constants {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        final int b = 100;
        // b = 100+1; - as b is a constant variable you cannot change te value
        System.out.println(b);
        System.out.println(b);

        final float PI = 3.14f;
        // PI = 90; - cannot change the PI value
        System.out.println(PI);



    }
}
