package ClassesAndObjects.BankAccountSystem;

public class AccountHolder {
   private String name;
   private int AccountNo;
   private Double Amount;


    AccountHolder(String name,int AccountNo){
          this.name = name;
          this.AccountNo = AccountNo;
          this.Amount = 0.0;
    }

   public Double checkBalance(){
        return Amount;
    }
    public int AccountNo(){
     return AccountNo;
    }
    public void AccountDetails(){
        System.out.println("Account-No \n" + AccountNo + "Name " + name);
    }
    public void deposit(double amount){
        if(amount<0){
            System.out.println("write a valid no ");
        }
        else{
            Amount = Amount+amount;
        }

    }
    public void withdraw(double amount){
        if(Amount<0||amount>Amount){
            System.out.println("Insufficient Balance ");
        }
        else{
            Amount = Amount - amount;
        }
    }
}
