package ex_28_Objects;

public class Sample extends Object{


    @Override
    public String toString(){
        System.out.println("This is comming from object? class");
        return null;
    }
    @Override
    public int hashCode(){
        System.out.println(" Comming from Object ");
        return 0;
    }
    @Override
    public boolean equals(Object Obj){
        System.out.println("This is comming from object class");
        return true;
    }
}
