package ex_27_Exceptions;

public class ex_16_Bank {
    public static void main(String[] args){
        ex_15_Bank_Example sbi = new ex_15_Bank_Example("INR",100);
        ex_15_Bank_Example icici = new ex_15_Bank_Example("INR",125);
        Integer total_bal = sbi.add(icici);
        System.out.println(total_bal);
        ex_15_Bank_Example Standard = new ex_15_Bank_Example("USD",140);
        Integer total_bal_all_countries = sbi.add(Standard);
        System.out.println(total_bal_all_countries);
    }
}
