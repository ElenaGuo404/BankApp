package org.qatraining.account;

public class SavingAccount extends BankAccount{

    private double interestRate;

    public SavingAccount(double balance, double minBalance, String accHolderName, double interestRate) {
        super(balance, minBalance, accHolderName);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
