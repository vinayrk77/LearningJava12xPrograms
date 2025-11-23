package ex_19_Inheritance_Single.RealEG;

public class Testcase1 extends CommontoAll {
    public static void main(String[] args) {
        Testcase1 test = new Testcase1();

        // Call the runningTC1 method to execute its code and produce output
        test.runningTC1();
    }

    void runningTC1(){
        StartBrowser();
        CloseBrowser();
        readexelfile();
        readingdatabasefile();
        System.out.println("Testcase 1 is running");
    }
}
