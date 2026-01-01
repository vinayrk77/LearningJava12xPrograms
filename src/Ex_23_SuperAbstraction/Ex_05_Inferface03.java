package Ex_23_SuperAbstraction;

public class Ex_05_Inferface03 {
    public static void main(String[] args) {
        vinay v = new vin();
        vin v1 = new vin();
        v.display();
        System.out.println(v.a);
    }
}

class vin implements vinay{
    @Override
    public void display(){
        System.out.println(a);
    }
}

interface vinay{
    int a = 100;
    void display();

}