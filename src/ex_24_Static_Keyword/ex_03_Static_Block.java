package ex_24_Static_Keyword;

public class ex_03_Static_Block {
    public static void main(String[] args) {
        A a = new A();

    }
}
class A{
    static{
        System.out.println("Called only once when class is loaded");
        System.out.println("you can write a code reading a excel file database");
    }
    static int a = 10;

    static void m1(){
        System.out.println("ststic function");
    }

}


