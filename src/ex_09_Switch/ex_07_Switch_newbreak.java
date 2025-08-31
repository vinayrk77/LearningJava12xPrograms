package ex_09_Switch;

public class ex_07_Switch_newbreak {
    public static void main(String[] args){
        int a = 001;
        switch (a){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("mismatch");
        }
    }
}
