package Lab_02.Problem1.PartA;

import static java.lang.Math.pow;

public class Cylinder extends Shape3D {
    private double radius, height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume(){ 
        return Math.PI * radius * height;
    }

    @Override
    public double surfaceArea(){
        return 2 * Math.PI * pow(radius, 2) + 2 * Math.PI * height;
    }
}
