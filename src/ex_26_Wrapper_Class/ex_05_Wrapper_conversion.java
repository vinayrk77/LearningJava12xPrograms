package ex_26_Wrapper_Class;

public class ex_05_Wrapper_conversion {
    public static void main(String[] args){
        String num = "10";
        int a = 100;
        // String wrapper conversion

        Integer b = Integer.parseInt(num); // (parse.x())
        //Double.parseDouble(), Float.parseFloat().

        // String to primitive

        int a_p = Integer.parseInt(num); //(String to WP -> wp to primitive unboxing.
        System.out.println(num);

        Integer aa3 = Integer.valueOf("1000");
        System.out.println(aa3);

        Integer aa10 = 100;
        String s = aa10.toString();
        System.out.println(aa10);
        System.out.println(s instanceof String);
    }
}
