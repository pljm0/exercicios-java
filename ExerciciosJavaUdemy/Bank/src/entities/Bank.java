package entities;

public class Bank {

    private int accountNumber;
    private String accountName;
    private double accountBalance;
    public Bank(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;

    }
    public int getAccountNumber() {
        return accountNumber;

    }

    public String getAccountName() {
        return accountName;

    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;

    }

    public double getAccountBalance() {
        return accountBalance;

    }

    public void doDeposit(double value) {
        accountBalance += value;

    }

    public void doWithdraw(double value) {
        accountBalance -= value + 5.00;

    }

    public String toString() {
        return "Account " + getAccountNumber() + ", "
                + "Holder: " + getAccountName() + ", "
                + "Balance: $ " + String.format("%.2f", getAccountBalance());

    }

}
