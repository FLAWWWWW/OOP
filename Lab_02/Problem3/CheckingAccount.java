package Lab_02.Problem3;

public class CheckingAccount extends Account {
    private final int free_transactions_amount = 3;
    private final double transaction_fee = 0.02;
    
    private int transactionCount;
    
    public CheckingAccount(int accNumber) {
        super(accNumber);
        transactionCount = 0;
    }
    
    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
        System.out.println("Checking account deposit processed. Transaction #" + transactionCount);
    }
    
    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
        System.out.println("Checking account withdrawal processed. Transaction #" + transactionCount);
    }
    
    @Override
    public void transfer(double amount, Account other) {
        super.transfer(amount, other);
        transactionCount++;
        System.out.println("Transfer transaction #" + transactionCount);
    }
    
    public void deductFee() {
        if (transactionCount > free_transactions_amount) {
            int excessTransactions = transactionCount - free_transactions_amount;
            double fee = excessTransactions * transaction_fee;
            
            if (getBalance() >= fee) {
                super.withdraw(fee);
                System.out.println("Deducted " + String.format("%.2f", fee) + 
                                 " fee for " + excessTransactions);
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("No fee deducted " + 
                             transactionCount + "/" + free_transactions_amount);
        }
        
        transactionCount = 0;
    }
    
    public int getTransactionCount() {
        return transactionCount;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Current Period Transactions: " + transactionCount + 
               ", Free Transactions: " + free_transactions_amount;
    }
}