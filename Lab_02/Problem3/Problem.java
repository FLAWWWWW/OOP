package Lab_02.Problem3;

public class Problem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        Account savings1 = bank.openSavingsAccount(1000, 5);
        Account savings2 = bank.openSavingsAccount(2000, 3.5);
        Account checking1 = bank.openCheckingAccount(500);
        Account checking2 = bank.openCheckingAccount(100);
        
        System.out.println();
        bank.printAllAccounts();
        
        
        savings1.deposit(200);
        savings1.withdraw(100);
        
        checking1.deposit(50);   
        checking1.withdraw(30);   
        
        savings2.transfer(150, checking2);
        
        System.out.println();
        bank.printAllAccounts();
        
        bank.update();
        
        bank.closeAccount(3);
        bank.printAllAccounts();
        
        bank.closeAccount(5);
        
        System.out.println("Total number of accounts: " + bank.getNumberOfAccounts());
        System.out.println("Total bank balance: " + String.format("%.2f", bank.getTotalBalance()));
        
        savings1.withdraw(5000);
        
        checking2.deposit(-50);
        
        savings2.transfer(10000, checking1);
    }
}