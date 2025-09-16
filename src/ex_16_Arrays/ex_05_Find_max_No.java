package ex_16_Arrays;

public class ex_05_Find_max_No {
    public static void main(String[] args){
        int array [] = {30,45,33,99,101,111,66,89,70,30,10};
        int max_number = give_max_element_array(array);
        System.out.println("Max is, " + max_number);

    }
    static int give_max_element_array(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }

        return max;
    }
}
