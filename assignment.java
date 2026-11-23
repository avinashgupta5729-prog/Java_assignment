
class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully.");
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}


public class  assignment{
    public static void main(String[] args) {

        
        BankAccount account1 = new BankAccount(101, "Rahul", 5000);
        BankAccount account2 = new BankAccount(102, "Amit", 8000);

        System.out.println("----- Account 1 -----");
        account1.deposit(2000);
        account1.withdraw(1000);
        account1.checkBalance();
        account1.displayDetails();

        System.out.println("\n----- Account 2 -----");
        account2.deposit(3000);
        account2.withdraw(2000);
        account2.checkBalance();
        account2.displayDetails();
    }
}




