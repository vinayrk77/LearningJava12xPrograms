package ex_18_Constructor;

public class ex_01_oops {
    public static void main(String[] args) {
        baby b1 = new baby();
        new baby();
        new baby();
        baby b2;

    }
}

class baby{
    String name;

    baby() {
        //This is called automatically when an object is created.
        System.out.println("I am called, Object is created");
    }
}