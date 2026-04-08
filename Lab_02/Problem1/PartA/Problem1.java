package Lab_02.Problem1.PartA;

public class Problem1 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(6);
        Cube cube = new Cube(6);
        Cylinder cylinder = new Cylinder(6, 6);

        System.out.println(String.format("Sphere\n Volume: %.2f\n Surface Area: %.2f\n", sphere.volume(), sphere.surfaceArea()));
        System.out.println(String.format("Cube\n Volume: %.2f\n Surface Area: %.2f\n", cube.volume(), cube.surfaceArea()));
        System.out.println(String.format("Cylinder\n Volume: %.2f\n Surface Area: %.2f\n", cylinder.volume(), cylinder.surfaceArea()));
    }
}
