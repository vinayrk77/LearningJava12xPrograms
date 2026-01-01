package Ex_23_SuperAbstraction;

public class EX_04_Multi_Inheri {
    public static void main(String[] args){
        Child child = new Child();
        child.money();
        child.f1();
        child.f2();
        child.df();
    }
}
class Child implements Father1,Mother1{
    @Override
    public void money(){
        System.out.println("Father money");
    }
    @Override
    public void f1(){
        System.out.println("completing function f1");
    }
    @Override
    public void f2(){
        System.out.println("completing function f2");
    }
}

interface Father1{
    void money();
    void f1();

    default void df(){
        System.out.println("This is just degault");
    }
}
interface Mother1{
    void money();
    void f2();
}