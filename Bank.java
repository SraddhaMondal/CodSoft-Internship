import java.util.Scanner;

class AccountBank {
    private double balance;

    public AccountBank(double initialBalance)
     {
        this.balance = initialBalance;
    }

    public double getBalance()
     {
        return balance;
    }

    public void deposit(double amount)
     {
        if (amount > 0)
         {
            balance += amount;
        }
    }

    public boolean withdraw(double amount)
     {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATM 
{
    private AccountBank account;

    public ATM(AccountBank account) 
    {
        this.account = account;
    }

    public void displayMenu() 
    {
        System.out.println("ATM Menu: ");
        System.out.println("1. Amount Withdraw: ");
        System.out.println("2. Amount Deposit: ");
        System.out.println("3. Check Balance: ");
        System.out.println("4. Exit: ");
    }

    public void run()
     {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) 
                    {
                        System.out.println("Withdrawal successful.");
                    } 
                    else
                     {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 3:
                    System.out.println("Your account balance is: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

public class Bank 
{
    public static void main(String[] args) 
    {
        AccountBank userAccount = new AccountBank(500.0); 
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}