package ex_13_Functions;

public class ex_02_Function_User_defined {
    public static void main(String[] args){
        int r1 = sum_of_two_no(4,5);
        int r2 = sum_of_two_no(100,99);
        System.out.println(r1);
        System.out.println(r2);

    }
    static int sum_of_two_no(int first, int second){
        return first + second;
    }
}
