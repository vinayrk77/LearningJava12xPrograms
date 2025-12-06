package ex_21_Encapsulation;

public class Ex_03_Encap_eg1 {
    public static void main(String[] args){
        BOI vinay = new BOI("Vinay", 100);
        System.out.println(vinay.getBalance());

        boolean isCashier = false;
        vinay.setBalance(10000, isCashier);
        System.out.println(vinay.getBalance());
        System.out.println(vinay.bankname);


    }
}

class BOI{
    private String Username;
    private long balance;
    public String bankname = "Bank of India";

    public BOI(String username, long balance) {
        Username = username;
        this.balance = balance;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isCashier) {
        if (isCashier){
            this.balance = balance;
        }else{
            System.out.println("You are not a cashier balancee is not updated");
        }
    }
}
