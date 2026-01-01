package ex_25_Enum;

public class ex_02_Example02 {
    public static void main(String[] args){
        System.out.println(URLS.katalon);
        if (URLS.katalon.equals("katalon")) {
            System.out.println("I want to do something fucking crazy");
        }

    }
    enum URLS{
        google, restassured, katalon, vwo
    }
}
