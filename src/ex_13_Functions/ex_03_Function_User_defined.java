package ex_13_Functions;

public class ex_03_Function_User_defined {
    public static void main(String[] args){
        int s1 = multi_of_two_no(99,99);
        int s2 = multi_of_two_no(50,5);
        System.out.println(s1);
        System.out.println(s2);
    }
    static int multi_of_two_no(int first,int second){
        return first*second;
    }
}
