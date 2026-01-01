package ex_25_Enum;

public class ex_04_Locator04 {
    public static void main(String[] args){
        System.out.println(Locators.page_input.getLocators());
        System.out.println(Locators.page_button.getLocators());
    }
}
enum Locators{
    page_button("#btn"),
    page_input("#input");

    private String locators;
    Locators(String locators){
        this.locators = locators;
    }
    String getLocators(){
        return this.locators;
    }
}
