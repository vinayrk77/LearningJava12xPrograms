package ex_26_Wrapper_Class;

public class ex_04_Wrapper_Ex {
    public static void main(String[] args){
        int a = 10;
        Integer b = a; //Boxing int-> Integer -> Autoboxing - java wil automatically do this.
        System.out.println(a);
        System.out.println(b);

        //Unboxing
        Integer aa = 100;
        int bb = aa;
        System.out.println(aa);
        System.out.println(bb);


    }
}
