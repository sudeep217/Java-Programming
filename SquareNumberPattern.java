import java.util.Scanner;

public class SquareNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the pattern
        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();

        // Print the pattern
        printSquareNumberPattern(numRows);
    }

    private static void printSquareNumberPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print spaces before the numbers
            for (int j = 1; j <= 2 * (numRows - i); j++) {
                System.out.print(" ");
            }

            // Print square numbers
            for (int k = 1; k <= i; k++) {
                int square = k * k;
                System.out.print(square + "   ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
