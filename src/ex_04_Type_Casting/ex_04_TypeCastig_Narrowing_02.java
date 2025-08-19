package ex_04_Type_Casting;

public class ex_04_TypeCastig_Narrowing_02 {
    public static void main(String[] args){
        long Ph_no = 8850139633l;
        //short s = Ph_no; // Narrowing - Implicit
        short s = (short) Ph_no;
        System.out.println(s);
    }
}