package Accounts;

import Exceptions.InsufficientFundsException;

public class Savings_Account extends BankAccount{

    private static final double MIN_BALANCE = 500.0;
    private static final double INTEREST_RATE = 0.05;



    public Savings_Account(int account_number, String account_Holder, double balance) {
        super(account_number, account_Holder, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {

        if( balance - amount < MIN_BALANCE) {
            throw new InsufficientFundsException("Insufficient funds to withdraw");
        }

            balance -= amount;
        System.out.println("Withdraw Successful : Current Balance ::"+ balance);
    }




}
