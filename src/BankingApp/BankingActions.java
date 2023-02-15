package BankingApp;

import java.time.LocalTime;

public class BankingActions {
    private double withDrawSum;
    private double interest;
    private double loanPeriod;
    private LocalTime localTime;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String time=LocalTime.now().toString();

    public LocalTime getLocalTime() {
        return localTime;
    }

    public LocalTime setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
        return localTime;
    }


    public double getWithDrawSum() {
        return withDrawSum;
    }

    public double setWithDrawSum(double withDrawSum) {
        this.withDrawSum = withDrawSum;
        return withDrawSum;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(double loanPeriod) {
        this.loanPeriod = loanPeriod;
    }
}

