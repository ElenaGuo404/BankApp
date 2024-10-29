package org.example.Account;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private static BankAccount bankAccount;

    @BeforeEach
    void setup(){
        bankAccount = new BankAccount(1000, 1, "Elena Guo");
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        assertEquals(bankAccount.getBalance(),1000);

        bankAccount.deposit(500);
        assertEquals(bankAccount.getBalance(), 1500);

    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        bankAccount.setBalance(2000);
        assertEquals(bankAccount.getBalance(),2000);

        bankAccount.withdraw(200);
        assertEquals(bankAccount.getBalance(),1800);

    }

    @Test
    void getBalance() {
        bankAccount.setBalance(200);
        assertEquals(bankAccount.getBalance(),200);
    }

    @Test
    void getMinBalance() {
        bankAccount.setMinBalance(10);
        assertEquals(bankAccount.getMinBalance(),10);
    }

    @Test
    void getAccHolderName() {
        bankAccount.setAccHolderName("Ann");
        assertEquals(bankAccount.getAccHolderName(),"Ann");
    }
}