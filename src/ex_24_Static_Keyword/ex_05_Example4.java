package ex_24_Static_Keyword;

public class ex_05_Example4 {
    public static void main(String[] args){
        Automation t1 = new Automation();
        System.out.println(t1.driver);
        System.out.println(Automation.driver);
        Automation.driver = "Firefor";
        System.out.println(Automation.driver);
        System.out.println(Automation.driver2);

    }
}

class Automation{
    static String driver = "Chrome";
    static String driver2;
}
