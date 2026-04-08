package Lab_02.Problem1.PartA;

import static java.lang.Math.pow;

public class Cube extends Shape3D {
    private double side;

    public Cube(double side){
        this.side = side;
    }

    @Override
    public double volume(){
        return pow(side, 3);
    }

    @Override
    public double surfaceArea(){
        return 6 * pow(side, 2);
    }
}
