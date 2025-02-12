package Accounts;

import Exceptions.InsufficientFundsException;

public abstract class BankAccount {
    private int account_number;
    private String account_Holder;
    protected double balance;

    public BankAccount(int account_number, String account_Holder, double balance) {
        this.account_number = account_number;
        this.account_Holder = account_Holder;
        this.balance = balance;
    }




    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " to " + this.account_Holder);
    }


    public abstract void withdraw(double amount) throws InsufficientFundsException ;


    public void display() {
        System.out.println("Account Number: " + this.account_number);
    }

    public double getAccountNumber() {
        return this.account_number;
    }
    public String getAccountHolder() {
        return this.account_Holder;
    }

    public double getBalance() {
        return balance;
    }
}
