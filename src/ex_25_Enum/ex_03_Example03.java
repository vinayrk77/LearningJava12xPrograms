package ex_25_Enum;

public class ex_03_Example03 {
    public static void main(String[] args){
        System.out.println(Color.BLACk.getHexCode());
    }
}
enum Color{
    RED("#FF0000"),
    GREEN("#ZZ0000"),
    YELLOW("#AA0000"),
    BLACk("#BB000");

    private String hexCode;
    Color(String hexCode){
        this.hexCode = hexCode;
    }
    String getHexCode(){
        return this.hexCode;
    }
}