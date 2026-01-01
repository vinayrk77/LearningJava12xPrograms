package Ex_23_SuperAbstraction;

public class Ex_01_Example1 {
    public static void main(String[] args){
        car c1 = new car(100);
        c1.display();
    }
}

class vehicle{
    public int maxspeed = 180;

    void noTest(){
        System.out.println("Empty!!");
    }
    vehicle(){
        System.out.println("Default const!!");
    }
    vehicle(int a) {
        System.out.println("para const");
    }
    vehicle(int a, int b) {
        System.out.println("2 para const");
    }
    //Method Overloading - Same, same name function with different arguments
    void message(){
        System.out.println("no Return, No Argument");
    }
    void message(int v){
        System.out.println("PC - argument");
    }
    void display(){
        System.out.println("Vehicle name");
    }
}
class car extends vehicle{
    private int maxspeed = 3000;

    car(){
        super(100);
    }
    void test(){}

    car(int a){
        System.out.println("PC car");
    }
    @Override
    void display(){
        System.out.println("override of car");
        System.out.println(super.maxspeed);
        System.out.println(this.maxspeed);
        super.noTest();
        this.test();
    }
}
