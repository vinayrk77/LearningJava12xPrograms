package ex_16_Arrays;

public class ex_06_Find_Max_Number {
    public static void main(String[] args){
        int array[] = {30,199,300,45,67,345,69,28,90,400};
        int max = array[0];

        for(int i=0;i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Max is, " + max);
    }
}
