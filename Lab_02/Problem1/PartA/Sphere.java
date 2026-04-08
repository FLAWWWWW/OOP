package Lab_02.Problem1.PartA;

import static java.lang.Math.pow;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double volume(){
        return 4/3 * Math.PI * pow(radius, 3);
    }

    @Override
    public double surfaceArea(){
        return 4 * Math.PI * pow(radius, 2);
    }
}
