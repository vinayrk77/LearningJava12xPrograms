package ex_16_Arrays;

public class ex_09_Sum_Of_Array {
    public static void main(String[] args){
        int add[] = {100,99,88,77};
        int sum = 0;
        for(int i =0; i<add.length;i++){
            sum = sum + add[i];
        }
        System.out.println(sum);
    }
}
