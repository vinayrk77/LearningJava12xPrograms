package ex_27_Exceptions;

public class ex_15_Bank_Example {
    private String currency;
    private Integer amount;

    public ex_15_Bank_Example(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(ex_15_Bank_Example bankname) {
        if (bankname.currency.equalsIgnoreCase("INR")) {
            return bankname.amount + this.amount;
        } else {
            try {
                throw new CustomException("Currency Mismatched Can't Proceed");
            } catch (CustomException e) {
                throw new RuntimeException(e);
            }
        }
    }

    class CustomException extends Exception {
        CustomException(String msg) {
            super(msg);
        }
    }
}