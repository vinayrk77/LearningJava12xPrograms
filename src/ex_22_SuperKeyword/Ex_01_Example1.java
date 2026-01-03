package ex_22_SuperKeyword;

public class Ex_01_Example1 {
}
class BaseClass{
    private String browser;

    public BaseClass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if(isAdmin){
        this.browser = browser;
    }else{
            System.out.println("not an admin, cannot change the browser");
        }
    }
    void openBrowser(){
        System.out.println("open Browser!!");
    }
    void openBrowser(String browsername){
        System.out.println("open Browser 11 -> " + browsername);
    }
    void closeBrowser(){
        System.out.println("Close Browser!!");
    }
}
class Testcase1 extends BaseClass{
    public Testcase1(String Browser){
        super(Browser);
        super.openBrowser();
        super.openBrowser("Chrome");
        super.closeBrowser();



    }

}