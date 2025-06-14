package ClassesAndObjects.BankAccountSystem;
import java.sql.SQLOutput;
import java.util.*;
public class UserSide {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Bank user = new Bank();
            System.out.println("---Bank Account System---");
            while(true) {
                System.out.println("Choose any one Option");
                System.out.println("1. Create Account \t 2. Existing Account");
                int check = sc.nextInt();
            if (check == 1) {
                System.out.println("Create Your Account");
                System.out.println("Enter Your Name");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("This is your Account No for Future transaction");
                Random rand = new Random();
                int randomInt = rand.nextInt(1000000000);
                System.out.println(randomInt);
                AccountHolder holder = new AccountHolder(name, randomInt);
                user.CreateAccount(holder);
            } else {
                System.out.println("1.Deposit \n");
                System.out.println("2.Withdraw\n");
                System.out.println("3.AccountDetails \n");
                System.out.println("4.BankBalance \n");
                System.out.println("5.Exit");
                int choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Enter Account No ");
                        int no = sc.nextInt();
                        System.out.println("Enter Amount");
                        int amount = sc.nextInt();
                        user.deposit(amount, no);
                        System.out.println("Thank you & Have a good day!!");
                        break;
                    case 2:
                        System.out.println("Enter Account No ");
                        int No = sc.nextInt();
                        System.out.println("Enter Amount");
                        int Amount = sc.nextInt();
                        user.Withdraw(Amount, No);
                        System.out.println("Thank you & Have a good day!!");
                        break;
                    case 3:
                        System.out.println("Enter your Account No");
                        int acc = sc.nextInt();
                        user.displayAccountDetails(acc);
                        break;
                    case 4:
                        int accc = sc.nextInt();
                        user.BankBalance(accc);
                        break;
                    case 5 :
                        System.out.println("exiting");
                        break;
                }
            }
        }
    }
}
