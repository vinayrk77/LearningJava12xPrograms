package ex_22_SuperKeyword;

public class Ex_02_Example2 {
    public static void main(String[] args){
        son s = new son();   // creates son object
        s.newhome();
    }
}

class father{
    father(){
        System.out.println("DC Father");
    }
    int gold = 10;
    void home(){
        System.out.println("Father Home");
    }
}
class son extends father{
    son(){
        super();
    }
    void newhome(){
        super.home();
        System.out.println(super.gold);
    }
}