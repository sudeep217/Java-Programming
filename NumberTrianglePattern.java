import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the pattern
        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();

        // Print the pattern
        printNumberTrianglePattern(numRows);
    }

    private static void printNumberTrianglePattern(int numRows) {
        // Print the upper half of the pattern
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Print the lower half of the pattern
        for (int i = numRows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
