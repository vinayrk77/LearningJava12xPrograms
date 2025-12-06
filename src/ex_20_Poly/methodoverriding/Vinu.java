package ex_20_Poly.methodoverriding;

public class Vinu extends Father {
    void v1(){
        System.out.println("Vinu - p1");
    }
    @Override
    void home(){
        System.out.println("Vinu's 3 bhk flat");
    }
}
