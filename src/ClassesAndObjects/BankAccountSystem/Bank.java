package ClassesAndObjects.BankAccountSystem;

import java.util.ArrayList;

public class Bank {
    private ArrayList<AccountHolder> Accounts = new ArrayList<>();
    public void CreateAccount(AccountHolder Account){
        Accounts.add(Account);
    }
    public void displayAccountDetails(int AccountNo){
        for(AccountHolder Account : Accounts){
            if(Account.AccountNo()==AccountNo){
              Account.AccountDetails();
            }
            else{
                System.out.println("Incorrect AccountNo");
            }
        }

    }
    public void Withdraw(int Amount,int AccountNo){
        for(AccountHolder Account : Accounts){
            if(Account.AccountNo()==AccountNo){
               Account.withdraw(Amount);
            }
            else{
                System.out.println("Incorrect AccountNo");
            }
        }
    }
    public void deposit(int Amount,int AccountNo){
        for(AccountHolder Account : Accounts){
            if(Account.AccountNo()==AccountNo){
               Account.deposit(Amount);
               System.out.println("your Money is successfully deposited in your account");
            }
            else{
                System.out.println("Incorrect AccountNo");
            }
        }
}
public void BankBalance(int AccountNo){
        for(AccountHolder Account : Accounts){
            if(Account.AccountNo()==AccountNo){
               Double balance = Account.checkBalance();
                System.out.println("Current Balance : "+ balance);
            }
            else{
                System.out.println("Invalid Credentials");
            }
        }
}
}
