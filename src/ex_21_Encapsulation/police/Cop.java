package ex_21_Encapsulation.police;

public class Cop {
    private int gun;
    String IdCard;

    public Cop(int gun){
        this.gun = gun;
    }
    protected void canIshoot(){
        System.out.println("yes you can shoot");
    }
}
