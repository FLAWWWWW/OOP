package practice_02;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        StarTriangle small = new StarTriangle(input.nextInt());
        System.out.print(small.to_String());
    }
}

class StarTriangle {
    int width;
    String star = "[*]";

    StarTriangle() { }

    StarTriangle(int w){
        width = w;
    }

    String to_String(){
        String result = "";
        int rows = 0;
        int cols = 0;

        while(cols < width){
            rows = 0;
            while(rows <= cols){
                result += "[*]";
                rows++;
            }
            cols++;
            result += "\n";
        }

        return result;
    }
}