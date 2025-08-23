package ex_08_If_Condition;

public class ex_02_if_p1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age > 18) {
            System.out.println("You can go to goa!");
        }else{
            System.out.println("You cannot go to Goa!");
        }

    }
}
