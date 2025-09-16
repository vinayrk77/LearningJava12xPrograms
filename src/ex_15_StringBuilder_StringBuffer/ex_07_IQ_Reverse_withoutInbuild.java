package ex_15_StringBuilder_StringBuffer;

public interface ex_07_IQ_Reverse_withoutInbuild {
    public static void main(String[] args){
        String input = "Lana";

        for(int i = input.length() -1; i >=0; i --)
        {
            System.out.print(input.charAt(i));
        }

    }
}
