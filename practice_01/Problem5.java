import java.util.Scanner;

public class Problem5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int balance = 1000;
        int interest = input.nextInt();

        balance += interest*balance/100;
        System.out.println("New balance next month: " + balance);
    }
}