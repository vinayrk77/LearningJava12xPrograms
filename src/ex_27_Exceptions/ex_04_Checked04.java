package ex_27_Exceptions;


import java.io.FileInputStream;
import java.io.InputStream;

public class ex_04_Checked04 {
    public static void main(String[] args){
        try {
            InputStream fileInputStream = new FileInputStream("C://Logs.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
