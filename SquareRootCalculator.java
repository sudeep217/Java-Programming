import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the perfect square number
        System.out.print("Enter a perfect square number: ");
        int perfectSquareNumber = scanner.nextInt();

        // Find and print the square roots (positive and negative)
        findSquareRoots(perfectSquareNumber);
    }

    private static void findSquareRoots(int number) {
        if (number < 0) {
            System.out.println("Invalid input. Please enter a non-negative number.");
            return;
        }

        double positiveSquareRoot = Math.sqrt(number);
        double negativeSquareRoot = -Math.sqrt(number);

        System.out.println("Positive Square Root: " + positiveSquareRoot);
        System.out.println("Negative Square Root: " + negativeSquareRoot);
    }
}
