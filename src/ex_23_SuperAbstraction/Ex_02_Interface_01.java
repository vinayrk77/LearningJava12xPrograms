package ex_23_SuperAbstraction;

public class Ex_02_Interface_01 {
    public static void main(String[] args){
        car1 Car1 = new car1();
        Car1.drive();
    }
}
class car1 implements Break,Engine1{

    void drive(){
        startEngine();
        testEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak(){
        System.out.println("Apply the Break");
    }
    @Override
    public void stopEngine(){
        System.out.println("Stop the Engine");

    }

    @Override
    public void startEngine() {
        System.out.println("Start the Engine");

    }
}

interface Break{
    void applyBreak();
}
interface Engine1{
    void startEngine();
    void stopEngine();
    default void testEngine(){
        System.out.println("Complete Class - The Engine Should Start");
    }
}