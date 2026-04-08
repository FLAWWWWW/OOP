package Lab_03.Problem5;

public class Test {
    public static void main(String[] args) {

        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Snickers", 70),
                new Chocolate("Mars", 60)
        };

        Sort.bubbleSort(chocolates);

        System.out.println("Sorted Chocolates:");
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }

        Time[] times = {
                new Time(12, 30),
                new Time(9, 15),
                new Time(18, 45)
        };

        Sort.mergeSort(times);

        System.out.println("\nSorted Times:");
        for (Time t : times) {
            System.out.println(t);
        }
    }
}