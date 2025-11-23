package ex_18_Constructor;

public class ex_02_paraConst {
    public static void main(String[] args) {
        Car2 tesla = new Car2();
        System.out.println(tesla.model);

        Car2 bugati = new Car2("bugati", 2011);
        System.out.println(bugati.model);
        System.out.println(bugati.year);
    }
}
