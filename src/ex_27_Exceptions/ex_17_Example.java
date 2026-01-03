package ex_27_Exceptions;

public class ex_17_Example {
    public static void main(String[] args){
        validate_age_clubbing(12);

    }
    static void validate_age_clubbing(int age){
        if (age < 18){
            try {
                throw new Exception("Age can't be less than 18");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }else{
            System.out.println("Enjoy clubbing ");
        }
    }
}
