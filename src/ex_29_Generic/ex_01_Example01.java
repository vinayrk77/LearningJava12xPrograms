package ex_29_Generic;

public class ex_01_Example01 {
    public static void main(String[] args){
        temp_sum(50,69);
        temp_sum("Vinay","Kumar");
        System.out.println(temp_sum(50,69));           // prints: 119
        System.out.println(temp_sum("Vinay","Kumar"));

    }
    static Integer temp_sum(Integer a, Integer b){
        return a+b;
    }
    static String temp_sum(String a, String b){
        return a+b;
    }
}
