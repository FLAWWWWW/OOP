import java.util.Scanner;

public class Problem6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.next();
        StringBuilder reversed_str = new StringBuilder(str);
        reversed_str = reversed_str.reverse();
        
        if(str.equals(reversed_str.toString())){
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("This is NOT a palindrome");
        }
    }
}