package ex_27_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ex_14_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f = new FileReader("C://abc.txt");
    }
}
