package ex_16_Arrays;

public class ex_01_Arrays_Eg {
    public static void main(String[] args){
        int a = 10;
        int [] marks = {98,89,70,35,46,88,87};
        boolean [] is_single_people = {true, false, true};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[5]);

        //Storing the values
        String[] name_atb12x = new String[3];
        name_atb12x[0] = "Virat";
        name_atb12x[1] = "Rohit";
        name_atb12x[2] = "Bole jo koyal";

        System.out.println(name_atb12x[0]);
        System.out.println(name_atb12x[1]);
        System.out.println(name_atb12x[2]);
        System.out.println(name_atb12x.length);

        boolean [] is_male = new boolean[2];
        is_male[0] = false;
        is_male[1] = true;
        System.out.println(is_male[1]);

    }
}
