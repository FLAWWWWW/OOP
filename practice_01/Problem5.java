import java.util.Scanner;

public class Problem5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int balance = 1000;
        int interest = input.nextInt();

        balance += interest;
        
        System.out.println("New balance: " + balance);
    }
}