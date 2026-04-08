package Lab_02.Problem3;

public class SavingsAccount extends Account {
    private double interestRate;
    
    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }
    
    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Added interest: $" + String.format("%.2f", interest) + 
                         " at rate " + interestRate + "%");
    }
    
    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        System.out.println("Savings account deposit processed");
    }
    
    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        System.out.println("Savings account withdrawal processed");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Interest Rate: " + interestRate + "%";
    }
    
    public double getInterestRate() {
        return interestRate;
    }
}