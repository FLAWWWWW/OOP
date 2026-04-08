package Lab_02.Problem3;

public class Account {
    private double balance;
    private int accNumber;
    
    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }
    
    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
            System.out.println("Add " + sum + " to account " + accNumber);
        } else {
            System.out.println("Invalid deposit");
        }
    }
    
    public void withdraw(double sum) {
        if (sum > 0 && sum <= balance) {
            balance -= sum;
            System.out.println("Take " + sum + " from account " + accNumber);
        } else if (sum > balance) {
            System.out.println("No-no-no, Mr. " + accNumber);
        } else {
            System.out.println("Invalid withdraw");
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public int getAccountNumber() {
        return accNumber;
    }
    
    public void transfer(double amount, Account other) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
            System.out.println("Transferred " + amount + " from account " + 
                             this.accNumber + " to account " + other.accNumber);
        } else {
            System.out.println("Transfer failed ):");
        }
    }
    
    @Override
    public String toString() {
        return "Account Number: " + accNumber + ", Balance: " + String.format("%.2f", balance);
    }
    
    public final void print() {
        System.out.println(toString());
    }
}