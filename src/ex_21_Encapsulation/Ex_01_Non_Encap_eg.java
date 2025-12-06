package ex_21_Encapsulation;

public class Ex_01_Non_Encap_eg {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("adimn","12345");
        System.out.println(vwoLogin.password);

        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);

    }
}
class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
