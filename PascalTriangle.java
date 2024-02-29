import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the Pascal's Triangle
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        // Print Pascal's Triangle
        printPascalsTriangle(numRows);
    }

    private static void printPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // Print spaces before the numbers
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("\t");
            }

            // Calculate and print the numbers
            for (int j = 0; j <= i; j++) {
                System.out.print("\t" + binomialCoefficient(i, j));
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

    private static int binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
