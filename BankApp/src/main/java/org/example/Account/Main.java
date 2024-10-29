package org.example.Account;

public class Main {


    public static void main(String[] args) {
        BankAccount[] bankAccount= new BankAccount[3];
        bankAccount[0] = new BankAccount(1300, 1, "Elena" ) ;
        bankAccount[1] = new CurrentAccount(1000, 1 ,"Elena", 500);
        bankAccount[2] = new SavingAccount(300, 0, "Ann", 0.05);

        for (BankAccount account : bankAccount){
            System.out.println(account);
        }

    }
}
