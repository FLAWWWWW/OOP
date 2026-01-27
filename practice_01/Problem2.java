import java.util.Scanner;
import static java.lang.Math.*;

public class Problem2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int side = input.nextInt();

        System.out.println("Area: " + side*side);
        System.out.println("Perimeter: " + side*4);
        System.out.println("Diagonal: " + sqrt(2)*side);
    }
}
