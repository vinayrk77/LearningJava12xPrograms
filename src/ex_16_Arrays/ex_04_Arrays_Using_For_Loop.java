package ex_16_Arrays;

public class ex_04_Arrays_Using_For_Loop {
    public static void main(String[] args){
        int[] marks = {52,34,40,35,99};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


        System.out.println(" ----- ");

        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);

            System.out.println(" ----- Enhance for loop");

            for (int mark : marks){
                System.out.println(mark);
            }
        }
    }
}
