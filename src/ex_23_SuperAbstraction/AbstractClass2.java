package ex_23_SuperAbstraction;

public class AbstractClass2 {
    public static void main(String[] args){
        Wagnor car = new Wagnor();
        car.drive();

    }
}
class Wagnor extends Engine implements tyre,Gear{
    void drive(){
        rubbertyre();
        blackcolortyre();
        changegear();
        StartEngine();
        stopEngine();
    }

    @Override
    void StartEngine(){
        System.out.println("Start the engine");
    }

    @Override
    public void rubbertyre() {

    }

    @Override
    public void blackcolortyre() {

    }

    @Override
    public void changegear() {

    }
}
abstract class Engine{
    abstract void StartEngine();
    void stopEngine(){
        System.out.println("Stop the car");
    }
}

interface tyre{
    void rubbertyre();
    void blackcolortyre();

    //this was introduced after jdk 11
    default void burntyre(){
        // This is a complete class
    }
    static void m1(){

    }
}
interface Gear{
    void changegear();
}