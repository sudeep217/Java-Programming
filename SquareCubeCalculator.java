import java.util.Scanner;

public class SquareCubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the decimal number
        System.out.print("Enter a decimal number: ");
        double decimalNumber = scanner.nextDouble();

        // Calculate and print the square and cube
        double square = calculateSquare(decimalNumber);
        double cube = calculateCube(decimalNumber);

        System.out.println("Square of the number: " + square);
        System.out.println("Cube of the number: " + cube);
    }

    private static double calculateSquare(double number) {
        return Math.pow(number, 2);
    }

    private static double calculateCube(double number) {
        return Math.pow(number, 3);
    }
}
