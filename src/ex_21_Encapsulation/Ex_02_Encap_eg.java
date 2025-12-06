package ex_21_Encapsulation;

import java.sql.SQLOutput;

public class Ex_02_Encap_eg {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("adimn","12345");
        System.out.println(vwoLogin.password);

        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);
        GoodVWOlogin vwologin1 = new GoodVWOlogin("admin", "pas1234");
        //System.out.println(vwologin1.password);
        System.out.println(vwologin1.getUsername());
        System.out.println(vwologin1.getPassword());
        vwologin1.setUsername("Vinay");
        System.out.println(vwologin1.getUsername());
        vwologin1.setPassword("maxiscrazy", true);
        System.out.println(vwologin1.getPassword());

    }
}
class GoodVWOlogin{
    private String username;
    private String password;

    public GoodVWOlogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin){
            this.password = password;
        }else{
            System.out.println("Not a admin so no password change");
        }
    }
}
