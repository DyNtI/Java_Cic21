import java.util.Arrays;
import java.util.Random;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int size = 10; // кількість значень
        double[] xValues = new double[size];    // масив x
        Double[] cosValues = new Double[size];  // масив cos(x)

        Random rand = new Random();

        System.out.println("Згенеровані значення x та відповідні cos(x):");
        for (int i = 0; i < size; i++) {
            xValues[i] = rand.nextDouble(); // значення в діапазоні [0; 1)
            cosValues[i] = Math.cos(xValues[i]);
            System.out.printf("x[%d] = %.5f -> cos(x[%d]) = %.5f%n", i, xValues[i], i, cosValues[i]);
        }

        // Сортування cos(x) за спаданням
        Arrays.sort(cosValues, Comparator.reverseOrder());

        System.out.println("\nВідсортовані значення cos(x) за спаданням:");
        for (int i = 0; i < cosValues.length; i++) {
            System.out.printf("cos[%d] = %.5f%n", i, cosValues[i]);
        }
    }
}
