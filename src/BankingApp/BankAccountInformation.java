package BankingApp;

public class BankAccountInformation {
    private double accountBalance;
    private String accountName;

    public double getAccountBalance() {
        return accountBalance;
    }

    public double setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
        return accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    private int interestRate;

}
