package Lab_03.Problem5;

public class Chocolate implements Comparable<Chocolate> {
    String name;
    double weight;

    Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Chocolate{name='%s', weight=%.2f}", name, weight);
    }

    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
    }
}