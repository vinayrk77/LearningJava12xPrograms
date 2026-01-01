package ex_24_Static_Keyword;

public class ex_02_Example2 {
    public static void main(String[] args){
        ATB Vinay = new ATB(898654327,"vikas");
        ATB Mittu = new ATB(999954327,"mitali");
        System.out.println(Mittu.phone_no);
        System.out.println(Mittu.name);
        System.out.println(Vinay.name);
        System.out.println(ATB.Course_name);
        System.out.println(ATB.Course_name);
        ATB.markattendence();

    }
}

class ATB{
    int phone_no;
    String name;
    static String Course_name = "ATB";
    public ATB(int phone_no, String name){
        this.phone_no = phone_no;
        this.name = name;

    }
    void display(){
        System.out.println(this.phone_no+this.name+Course_name);
    }
    static void markattendence(){
        System.out.println("Mark Attendece");
    }
}
