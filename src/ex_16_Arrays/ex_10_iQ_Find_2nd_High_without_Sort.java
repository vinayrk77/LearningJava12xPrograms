package ex_16_Arrays;

public class ex_10_iQ_Find_2nd_High_without_Sort {
    public static void main(String[] args){
        int numbers[] = {45,55,65,74,85,95,105,110};

        int highest = 0;
        int secondHighest = 0;

        for(int num : numbers){
            if (num > highest){
                secondHighest = highest;
                highest = num;
            }else if (num > secondHighest && num != highest){
                secondHighest = num;
            }
        }
        System.out.println(secondHighest);
    }
}
