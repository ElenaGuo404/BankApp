package org.qatraining.account;

public class BankAccount {

    private double balance;
    private double minBalance;
    private String accHolderName;

    public BankAccount(double balance, double minBalance, String accHolderName ){
        this.balance = balance;
        this.minBalance = minBalance;
        this.accHolderName = accHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void deposit(double depositMoney){
        this.balance += depositMoney;
    }

    public void withdraw(double withdrawMoney){
        this.balance -= withdrawMoney;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", minBalance=" + minBalance +
                ", accHolderName='" + accHolderName + '\'' +
                '}';
    }
}
