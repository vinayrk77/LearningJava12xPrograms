package ex_10_For_Loop;

public class ex_09_For_Loop_Continue {
    public static void main(String[] args){
        for(int i = 0; i <= 50; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println("Odd Numbers ->" +i);
        }
    }
}
