package ex_20_Poly.methodoverriding;

public class OP {
    public static void main(String[] args){
        Vinu v = new Vinu();
        v.home();
        v.v1();

        Father f = new Father();
        f.home();
        f.f1();

        Father f2 = new Vinu();
        f2.home();
    }
}
