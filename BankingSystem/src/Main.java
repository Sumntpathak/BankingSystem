import Accounts.BankAccount;
import Accounts.CurrentAccount;
import Accounts.Savings_Account;
import Exceptions.InsufficientFundsException;

public class Main {
    public static void main(String[] args) {

        BankAccount savings = new Savings_Account(10041,"Sumant",1000.0);
        BankAccount current = new CurrentAccount(10025,"Rajat",2000.0);


        try{
            savings.deposit(5000.0);
            savings.withdraw(5000.0);
        }catch(InsufficientFundsException e){
            System.out.println("Error:" + e.getMessage());
        }


        try{
            current.deposit(5000.0);
            current.withdraw(10000.0);
        }catch(InsufficientFundsException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}