import java.util.Scanner;
import static java.lang.Math.*;

public class Problem4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int d = powExact(b, 2) - 4*a*c;
        double sqrt_d = sqrt(d);
        double x1, x2;

        if(d > 0){
            x1 = (-b + sqrt_d)/2*a;
            x2 = (-b - sqrt_d)/2*a;

            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);
        }
        else if(d == 0){
            x1 = -b/2*a;
            
            System.out.println("X: " + x1);
        }
        else{
            System.out.println("There is no root's");
        }
    }
}