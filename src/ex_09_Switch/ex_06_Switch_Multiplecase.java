package ex_09_Switch;

public class ex_06_Switch_Multiplecase {
    public static void main(String[] args){
        int a = 006;
        switch (a){
            case 001,002,003 -> System.out.println("All of them are invalid");
            case 004,005,006 -> System.out.println("Match");
        }
    }
}
