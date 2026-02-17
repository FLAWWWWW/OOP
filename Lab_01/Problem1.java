package Lab_01;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        System.out.println("Enter number (Q to quit): ");
        Scanner input = new Scanner(System.in);
        Data data = new Data();

        while (input.hasNext()) {
            if (input.hasNextInt()) {
                int number = input.nextInt();
                data.addData(number);
                System.out.println("Enter number (Q to quit): ");
            } 

            else {
                String token = input.next();
                if (token.equalsIgnoreCase("Q")) {
                    break;
                } else {
                    System.out.println("Invalid input");
                    System.out.println("Enter number (Q to quit): ");
                }
            }
        }

        System.out.println(String.format("Average = %.1f", data.getAvg()));
        System.out.println(String.format("Maximum = %.1f", data.getMax()));
    }
}

class Data{
    private double sum;
    private double max;
    private int count;

    Data(){
        this.sum = 0;
        this.max = 0;
        this.count = 0;
    }

    void addData(int input_num){
        sum += input_num;
        count++;

        if(max < input_num) max = input_num;
    }

    double getAvg(){
        return Analyzer.calculateAvg(sum, count);
    }

    double getMax(){
        return max;
    }
}

class Analyzer{
    static double calculateAvg(double sum, int count){
        if(count == 0) return 0;
        else return sum/count;
    }
}