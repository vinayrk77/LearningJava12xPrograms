package Poly.methodoverriding;

public class RealExample {
    public static void main(String[] args){
        TC_Chrome t = new TC_Chrome();
        t.Browser();
    }
}
    class commontoallTC{
    void Browser(){
        System.out.println("Open Browser");
    }
}
class TC_Chrome extends commontoallTC{
    void Browser(){
        System.out.println("Opening the chrome browser!");
        //new chrome driver(write code to open chrome)
    }
}
