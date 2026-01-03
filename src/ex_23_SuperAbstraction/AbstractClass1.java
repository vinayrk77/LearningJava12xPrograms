package ex_23_SuperAbstraction;

public class AbstractClass1 {
    public static void main(String[] args){
        son s1 = new son();
        s1.loan50k();
        //Father Fi = new Father(); - abstract classes cannot be initiated

    }
}
class normal{
    // Concrete class -> Complete class.

}
abstract class Father{
    abstract void loan50k();
}
class son extends Father{
    @Override
    void loan50k() {
        System.out.println("Loan Completed");
    }
}
