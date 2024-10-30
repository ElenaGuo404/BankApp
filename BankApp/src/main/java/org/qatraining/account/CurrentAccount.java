package org.qatraining.account;

public class CurrentAccount extends BankAccount{

    private double maxWithdrawnAmount;

    public CurrentAccount(double balance, double minBalance, String accHolderName, double maxWithdrawnAmount) {
        super(balance, minBalance, accHolderName);
        this.maxWithdrawnAmount = maxWithdrawnAmount;

    }

    public double getMaxWithdrawnAmount() {
        return maxWithdrawnAmount;
    }

    public void setMaxWithdrawnAmount(double maxWithdrawnAmount) {
        this.maxWithdrawnAmount = maxWithdrawnAmount;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "maxWithdrawnAmount=" + maxWithdrawnAmount +
                '}';
    }
}
