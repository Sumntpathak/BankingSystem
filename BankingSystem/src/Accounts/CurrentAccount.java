package Accounts;

import Exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount{

    private static double OVER_DRAFT = 2000.00;

    public CurrentAccount(int account_number, String account_Holder, double balance) {
        super(account_number, account_Holder, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > OVER_DRAFT) {
            throw new InsufficientFundsException("Insufficient Funds");
        }

        balance -= amount;
        System.out.println("Current Account Balance: " + balance);
    }
}
