package Lab_02.Problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;
    private int nextAccountNumber;
    
    public Bank() {
        accounts = new Vector<>();
        nextAccountNumber = 1;
    }
    
    public Account openAccount(String accountType, double initialDeposit, double interestRate) {
        Account newAccount = null;
        int accNumber = nextAccountNumber++;
        
        switch (accountType.toLowerCase()) {
            case "savings":
                newAccount = new SavingsAccount(accNumber, interestRate);
                break;
            case "checking":
                newAccount = new CheckingAccount(accNumber);
                break;
            default:
                newAccount = new Account(accNumber);
                break;
        }
        
        if (initialDeposit > 0) {
            newAccount.deposit(initialDeposit);
        }
        
        accounts.add(newAccount);
        System.out.println("Opened new " + accountType + " account: " + newAccount);
        return newAccount;
    }
    
    public Account openAccount(String accountType) {
        return openAccount(accountType, 0, 0);
    }
    
    public Account openSavingsAccount(double initialDeposit, double interestRate) {
        return openAccount("savings", initialDeposit, interestRate);
    }
    
    public Account openCheckingAccount(double initialDeposit) {
        return openAccount("checking", initialDeposit, 0);
    }
    
    public boolean closeAccount(int accNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accNumber) {
                Account removed = accounts.remove(i);
                System.out.println("Closed account: " + removed);
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
    
    public void update() {
        for (Account acc : accounts) {
            System.out.println("\nProcessing account " + acc.getAccountNumber() + ":");
            
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            } else if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
            }
            
            acc.print();
        }
    }
    
    public Account getAccount(int accNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNumber) {
                return acc;
            }
        }
        return null;
    }
    
    public void printAllAccounts() {
        System.out.println("\nAll Bank Accounts:\n");
        for (Account acc : accounts) {
            System.out.println(" -" + acc);
        }
        System.out.println();
    }
    
    public double getTotalBalance() {
        double total = 0;
        for (Account acc : accounts) {
            total += acc.getBalance();
        }
        return total;
    }
    
    public int getNumberOfAccounts() {
        return accounts.size();
    }
}