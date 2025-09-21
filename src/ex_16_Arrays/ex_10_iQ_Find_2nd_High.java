package ex_16_Arrays;
import java.util.Arrays;

public class ex_10_iQ_Find_2nd_High {
    public static void main(String[] args){
        int z[] = {100,1000,999,30,88,90,2000};
        Arrays.sort(z);
        System.out.println(z[z.length-2]);


    }
}
